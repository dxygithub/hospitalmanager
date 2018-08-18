var $;
//form表单提交事件
layui.use('form', function() {
    var form = layui.form;
    $=jQuery=layui.jquery;
    //监听提交
    form.on('submit(formDemo)', function(data) {
        login();
        return false;
    });
});

function login() {
    var roleInfo = $(".layui-form").serialize();
    $.ajax({
        url:"/loginAdmin.do",
        data:roleInfo,
        dataType:"json",
        type:"post",
        success:function (date) {
            if (date=="登录成功") {
                location.href="/Managerindex";
            }else{
                alert(date);
            }
        }

    })
}