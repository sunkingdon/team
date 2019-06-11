jQuery(document).ready(function($) {
  //open popup
  $(".cd-popup-trigger").on("click", function(event) {
    console.log("aaa");
    event.preventDefault();
    $(".cd-popup").addClass("is-visible");
    console.log("aaa");
  });

  //close popup
  $(".cd-popup").on("click", function(event) {
    if (
      $(event.target).is(".cd-popup-close") ||
      $(event.target).is(".cd-popup")
    ) {
      event.preventDefault();
      $(this).removeClass("is-visible");
    }
  });
  //close popup when clicking the esc keyboard button
  $(document).keyup(function(event) {
    if (event.which == "27") {
      $(".cd-popup").removeClass("is-visible");
    }
  });
});
