$(document).ready(function(){
    $('#editRole').click(function(e) {
        $('input[type="text"]').each(function() {
            if( $.trim($(this).val()) == '') {
                $(this).parents('p').addClass('warning');
                return false;
            }
        });
    });
});