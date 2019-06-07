/*

-Slider-home
-Nav mobile
-Back-to-top
-Counter
-Popup-video
-Search
-FilterSlider
-Slick-slider

*/


$(document).ready(function() {

    "use strict";



        // Function for accordionShop
      function accordionShop() {
          var ShopNav = $(".widget-woof-content > section");
          var ShopMenu = ShopNav.find(".widget-woof-content .widget-content");
          var menuItemShop = ShopNav.find(" .widget_collapse ");

          ShopMenu.hide();
          menuItemShop.on("click", function(e) {
              var $this = $(this);
              $this.siblings().slideToggle();
               e.preventDefault();
              e.stopImmediatePropagation();
          })
      }
      accordionShop();

    
      /*-----------------------------
          Counter
      -------------------------------*/
      $('.counter').counterUp({
          delay: 10,
          time: 1000
      });


      /*-----------------------------
          Search
      -------------------------------*/
      

      function search() {
        var searchOpen = $('.ps-search-btn'),
            searchClose = $('.ps-search__close'),
            searchbox = $('.ps-search');
        searchOpen.on('click', function(e) {
            e.preventDefault();
            searchbox.addClass('open');
        });
        searchClose.on('click', function(e) {
            e.preventDefault();
            searchbox.removeClass('open');
        });
      }

      /*-----------------------------
          FilterSlider
      -------------------------------*/
      function filterSlider() {
        var el = $('.ps-slider');
        var min = el.siblings().find('.ps-slider__min');
        var max = el.siblings().find('.ps-slider__max');
        var defaultMinValue = el.data('default-min');
        var defaultMaxValue = el.data('default-max');
        var maxValue = el.data('max');
        var step = el.data('step');
        if (el.length > 0) {
            el.slider({
                min: 0,
                max: maxValue,
                step: step,
                range: true,
                values: [defaultMinValue, defaultMaxValue],
                slide: function(event, ui) {
                    var values = ui.values;
                    min.text('$' + values[0]);
                    max.text('$' + values[1]);
                }
            });
            var values = el.slider("option", "values");
            console.log(values[1]);
            min.text('$' + values[0]);
            max.text('$' + values[1]);
        }
        else {
            // return false;
        }
    }
    $(function() {
       search();
       filterSlider();
    });  

});
