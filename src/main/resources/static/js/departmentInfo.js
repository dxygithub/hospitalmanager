//注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
layui.use(['element', 'layer'], function(){
  var element = layui.element;
  var layer = layui.layer;
  var $$ = layui.jquery;

  getRoleInfo();

  //获取登录信息
  function getRoleInfo() {
      alert("get");
      $$.get("/getLoginRole.do",{},function (date) {
          alert(date);
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