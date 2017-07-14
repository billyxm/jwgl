//获取radio的值改变input 的类型为text的name的value
$(':radio').click(function () {
        var name = 'user.userId';
        if (this.value == 'student') name = 'stu.sno';
        if (this.value == 'teacher') name = 'tea.tno';
        $('#idnum').attr('name',name)
    }).filter(':checked').trigger('click');

$(':radio').click(function () {
        var name = 'user.password';
        if (this.value == 'student') name = 'stu.password';
        if (this.value == 'teacher') name = 'tea.tpassword';
        $('#pwd').attr('name',name)
    }).filter(':checked').trigger('click');
