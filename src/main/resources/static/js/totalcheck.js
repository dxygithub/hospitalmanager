
layui.use('laydate',function() {
    var laydate = layui.laydate;
    var layer = layui.layer;
    //开启公历节日
    laydate.render({
        elem: '#checkDate',
        calendar: true,
        page:false,
    });
});
