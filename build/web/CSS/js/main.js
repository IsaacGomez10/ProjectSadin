$(document).ready(function() {
  /*-------navbar---------*/
  $(window).on("scroll", function() {
    if ($(this).scrollTop() > 90) {
      $(".navbar").addClass("navbar-shrink");
    }
    else {
      $(".navbar").removeClass("navbar-shrink");
    }
  });

});

