layui.use('table', function() {
	var table = layui.table;

	//第一个实例
	table.render({
		elem: '#test',
		height: 315,
		limit:2,
		page:1,
		url: 'nursePre.do' //数据接口
			,
		page: true //开启分页
			,
		cols: [
			[ //表头
				{
					field: 'testNumber',
					title: '预约编号',
					width: 100,
					sort: true,
					fixed: 'left'
				}, {
					field: 'userName',
					title: '姓名',
					width: 80
				}, {
					field: 'sex',
					title: '性别',
					width: 80,
				}, {
					field: 'age',
					title: '年龄',
					width: 80
				}, {
					field: 'born',
					title: '出生日期',
					width: 100
				}, {
					field: 'idCard',
					title: '身份证',
					width: 90
				}, {
					field: 'telephone',
					title: '联系电话',
					width: 100
				}, {
					field: 'nameCode',
					title: '姓名拼音简码',
					width: 130
				}, {
					field: 'status',
					title: '状态',
					width: 80
				},
				{
					field: 'bj',
					title: '编辑',
					width: 80
				}
			]
		]
	});
});