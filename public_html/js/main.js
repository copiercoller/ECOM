$(function () {
    $.get("./components/header.html", function (res) {
        $("body").prepend(res);
    });
    $.get("./components/footer.html", function (res) {
        $("body").append(res);
    });
});