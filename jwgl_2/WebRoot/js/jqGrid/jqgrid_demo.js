$(function()
{
        $("#gridTable").jqGrid({
                url:'json/jqgrid.action',
                datatype: "json",
                height: 250,
                colNames:['编号','用户名', '性别', '邮箱', 'QQ','手机号','出生日期'],
                colModel:[
                        {name:'id',index:'id', sorttype:"int"},
                        {name:'userName',index:'userName',
                        {name:'gender',index:'gender',
                        {name:'email',index:'email', ;string"},
                        {name:'QQ',index:'QQ', ;            
                        {name:'mobilePhone',index:'mobilePhone', ;            
                        {name:'birthday',index:'birthday', sorttype:"date"}
                ],
                sortname:'id',
                sortorder:'asc',
                viewrecords:true,
                rowNum:10,
                rowList:[10,20,30],
                jsonReader: {
                        root:"dataRows",                // 数据行（默认为：rows）
                        page: "curPage",            // 当前页
                        total: "totalPages",    // 总页数
                        records: "totalRecords",    // 总记录数
                        repeatitems : false                // 设置成false，在后台设置值的时候，可以乱序。且并非每个值都得设
                },
                prmNames:{rows:"page.pageSize",page:"page.curPageNo",sort:"page.orderBy",order:"page.order"},
                pager:"#gridPager",
                caption: "jqGrid与Struts2集成"
}).navGrid('#gridPager',{edit:false,add:false,del:false});
})