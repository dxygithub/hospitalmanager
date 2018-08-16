//注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
layui.use(['element', 'layer'], function(){
  var element = layui.element;
  var layer = layui.layer;
  var $$ = layui.jquery;

  getRoleInfo();

  //快速搜索按钮
  $$("#LAY_delallmsg").click(function () {
     var testNumber=$$("input[name=testNumber]").val();
      //获取用户的体检次数
      $$.get("/getUserCheckCount",{"testNumber":testNumber},function (date) {
          $$("#checkcount").text(date);
      },"text");

      //获取用户的信息
      $$.get("/getUserRegisterInfoByTestNumber.do",{"testNumber":testNumber},function (date) {
          var userRegisterInfo = JSON.parse(date);
          $$(".username").text(userRegisterInfo.userName);
          $$(".sex").text(userRegisterInfo.sex);
          $$(".age").text(userRegisterInfo.age);
          if(userRegisterInfo.status==1) {
              $$(".status").text("个人");
              $$(".personType").text("");
              $$(".unitsName").text("");
          }else {
              $$(".status").text("单位");
              $$(".personType").text(userRegisterInfo.personType);
              //根据公司编号查询公司名称
              $$.get("/getUnitsNameByUnitsId",{"unitsId":userRegisterInfo.belongtoUnits},function (unitsName) {
                  $$(".unitsName").text(unitsName);
              },"text");
          }
      },"text");
      getMadical(testNumber);
      getCom(testNumber);
      getPackage(testNumber);
  });

  //获取用户的体检项
  function getMadical(testNumber) {
      $$.getJSON("/getMadical",{"testNumber":testNumber},function (date) {
          console.log(date);
          var MedicalContent="";
        $$.each(date,function (i,e) {
            if(e.deskTypeName=="检查"){
              MedicalContent+="<div class=\"layui-colla-item\">\n" +
                  "<h2 class=\"layui-colla-title\">"+e.deskName+"<i class=\"layui-icon layui-colla-icon\"></i></h2>" +
                  "<div class=\"layui-colla-content layui-show\">" +
                    "<div class=\"layui-form-item\">" +
                    "<label class=\"layui-form-label\">"+e.projectName+"：</label>" +
                      "<div class=\"layui-input-block\" style=\"width: 400px;\">" +
                        "<input type=\"text\" name=\"title\" placeholder=\"请输入身高\" autocomplete=\"off\" class=\"layui-input\">" +
                      "</div>" +
                    "</div>" +
                  "</div>" +
                  "</div>";
            }else if(e.deskTypeName=="检验"){
              MedicalContent+="<div class=\"layui-colla-item\">\n" +
                  "<h2 class=\"layui-colla-title\">"+e.projectName+"<i class=\"layui-icon layui-colla-icon\"></i></h2>" +
                  "<div class=\"layui-colla-content layui-show\">" +
                  "<div style=\" width: 600px;\">" +
                  "诊断结果：<textarea name=\"checkresult\" placeholder=\"请输入内容\" class=\"layui-textarea\"></textarea>" +
                  "</div>" +
                  "</div>" +
                  "</div>";
            }else{
                //功能
            }
        })
          $$("#medical").html(MedicalContent);
          element.init();
      })
  }

    //获取用户的组合项
    function getCom(testNumber) {
        var comContent="";
        var PackageContent="";
        $$.getJSON("/getPackage",{"testNumber":testNumber},function (date) {
            console.log(date);
            $$.each(date,function (i,e) {
                if(e.deskTypeName=="检验"){

                }else if(e.deskTypeName=="检查"){
                    PackageContent+="<div class=\"layui-form-item\">" +
                        "<label class=\"layui-form-label\">"+e.projectName+"：</label>" +
                        "<div class=\"layui-input-block\" style=\"width: 400px;\">" +
                        "<input type=\"text\" name=\"title\" placeholder=\"结论：\" autocomplete=\"off\" class=\"layui-input\">" +
                        "</div>" +
                        "</div>";
                }
            })
            comContent= "<div class=\"layui-colla-item\">\n" +
                    "<h2 class=\"layui-colla-title\">组合项目<i class=\"layui-icon layui-colla-icon\"></i></h2>" +
                    "<div class=\"layui-colla-content\">" +
                      PackageContent
                      +
                      "<div style=\" width: 600px;\">" +
                        "诊断结果：<textarea name=\"checkresult\" placeholder=\"请输入内容\" class=\"layui-textarea\"></textarea>" +
                      "</div>" +
                    "</div>" +
                  "</div>";
            $$("#com").html(comContent);
            element.init();
        })
    }

    function getPackage(testNumber) {

    }

  //获取登录信息
  function getRoleInfo() {
      $$.get("/getLoginRole.do",{},function (date) {
          $$(".username").text(date.roleName);
      },"json");
  }

  //监听折叠
  element.on('collapse(test)', function(data){
    layer.msg('展开状态：'+ data.show);
  });
});


//form表单提交事件
layui.use('form', function () {
    var form = layui.form;
    //监听提交
    form.on('submit(formDemo)', function (data) {
        layer.msg(JSON.stringify(data.field));
        return false;
    });
});