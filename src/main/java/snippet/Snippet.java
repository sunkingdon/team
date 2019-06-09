package snippet;

public class Snippet {
	
	:root { -
		-blue: #007bff; -
		-indigo: #6610f2; -
		-purple: #6f42c1; -
		-pink: #e83e8c; -
		-red: #dc3545; -
		-orange: #fd7e14; -
		-yellow: #ffc107; -
		-green: #28a745; -
		-teal: #20c997; -
		-cyan: #17a2b8; -
		-white: #fff; -
		-gray: #6c757d; -
		-gray-dark: #343a40; -
		-primary: #ffbc12; -
		-secondary: #6c757d; -
		-success: #28a745; -
		-info: #17a2b8; -
		-warning: #ffc107; -
		-danger: #dc3545; -
		-light: #f8f9fa; -
		-dark: #343a40; -
		-breakpoint-xs: 0; -
		-breakpoint-sm: 576px; -
		-breakpoint-md: 768px; -
		-breakpoint-lg: 992px; -
		-breakpoint-xl: 1200px; -
		-font-family-sans-serif: "Roboto", sans-serif; -
		-font-family-monospace: SFMono-Regular, Menlo, Monaco, Consolas,
			"Liberation Mono", "Courier New", monospace;
	}
	
	.store-container {
		width: 100%;
		padding-right: 15px;
		padding-left: 15px;
		margin-right: auto;
		margin-left: auto;
		margin-top: 30px;
		margin-bottom: 100px;
	}
	
	@media ( min-width : 576px) {
		.store-container {
			max-width: 540px;
		}
	}
	
	@media ( min-width : 768px) {
		.store-container {
			max-width: 720px;
		}
	}
	
	@media ( min-width : 992px) {
		.store-container {
			max-width: 960px;
		}
	}
	
	@media ( min-width : 1200px) {
		.store-container {
			max-width: 1200px;
		}
	}
	
	.col-1, .col-2, .col-3, .col-4, .col-5, .col-6, .widget-advertisement .columns-2 .advertisement__item,
		.col-7, .col-8, .col-9, .col-10, .col-11, .col-12, .col, .col-auto,
		.col-sm-1, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6,
		.col-sm-7, .col-sm-8, .col-sm-9, .col-sm-10, .col-sm-11, .col-sm-12,
		.col-sm, .col-sm-auto, .col-md-1, .col-md-2, .col-md-3, .col-md-4,
		.col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-10,
		.col-md-11, .col-md-12, .widget-advertisement .columns-1 .advertisement__item,
		.col-md, .col-md-auto, .col-lg-1, .col-lg-2, .col-lg-3, .col-lg-4,
		.col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-10,
		.col-lg-11, .col-lg-12, .col-lg, .col-lg-auto, .col-xl-1, .col-xl-2,
		.col-xl-3, .col-xl-4, .col-xl-5, .col-xl-6, .col-xl-7, .col-xl-8,
		.col-xl-9, .col-xl-10, .col-xl-11, .col-xl-12, .col-xl, .col-xl-auto {
		position: relative;
		width: 100%;
		min-height: 1px;
		padding-right: 15px;
		padding-left: 15px;
	}
	
	.col {
		flex-basis: 0;
		flex-grow: 1;
		max-width: 100%;
	}
	
	.col-auto {
		flex: 0 0 auto;
		width: auto;
		max-width: none;
	}
	
	.col-1 {
		flex: 0 0 8.33333%;
		max-width: 8.33333%;
	}
	
	.col-2 {
		flex: 0 0 16.66667%;
		max-width: 16.66667%;
	}
	
	.col-3 {
		flex: 0 0 25%;
		max-width: 25%;
	}
	
	.col-4 {
		flex: 0 0 33.33333%;
		max-width: 33.33333%;
	}
	
	.col-5 {
		flex: 0 0 41.66667%;
		max-width: 41.66667%;
	}
	
	.col-6, .widget-advertisement .columns-2 .advertisement__item {
		flex: 0 0 50%;
		max-width: 50%;
	}
	
	.col-7 {
		flex: 0 0 58.33333%;
		max-width: 58.33333%;
	}
	
	.col-8 {
		flex: 0 0 66.66667%;
		max-width: 66.66667%;
	}
	
	.col-9 {
		flex: 0 0 75%;
		max-width: 75%;
	}
	
	.col-10 {
		flex: 0 0 83.33333%;
		max-width: 83.33333%;
	}
	
	.col-11 {
		flex: 0 0 91.66667%;
		max-width: 91.66667%;
	}
	
	.col-12 {
		flex: 0 0 100%;
		max-width: 100%;
	}
	
	.order-first {
		order: -1;
	}
	
	.order-last {
		order: 13;
	}
	
	.order-0 {
		order: 0;
	}
	
	.order-1 {
		order: 1;
	}
	
	.order-2 {
		order: 2;
	}
	
	.order-3 {
		order: 3;
	}
	
	.order-4 {
		order: 4;
	}
	
	.order-5 {
		order: 5;
	}
	
	.order-6 {
		order: 6;
	}
	
	.order-7 {
		order: 7;
	}
	
	.order-8 {
		order: 8;
	}
	
	.order-9 {
		order: 9;
	}
	
	.order-10 {
		order: 10;
	}
	
	.order-11 {
		order: 11;
	}
	
	.order-12 {
		order: 12;
	}
	
	.offset-1 {
		margin-left: 8.33333%;
	}
	
	.offset-2 {
		margin-left: 16.66667%;
	}
	
	.offset-3 {
		margin-left: 25%;
	}
	
	.offset-4 {
		margin-left: 33.33333%;
	}
	
	.offset-5 {
		margin-left: 41.66667%;
	}
	
	.offset-6 {
		margin-left: 50%;
	}
	
	.offset-7 {
		margin-left: 58.33333%;
	}
	
	.offset-8 {
		margin-left: 66.66667%;
	}
	
	.offset-9 {
		margin-left: 75%;
	}
	
	.offset-10 {
		margin-left: 83.33333%;
	}
	
	.offset-11 {
		margin-left: 91.66667%;
	}
	
	@media ( min-width : 576px) {
		.col-sm {
			flex-basis: 0;
			flex-grow: 1;
			max-width: 100%;
		}
		.col-sm-auto {
			flex: 0 0 auto;
			width: auto;
			max-width: none;
		}
		.col-sm-1 {
			flex: 0 0 8.33333%;
			max-width: 8.33333%;
		}
		.col-sm-2 {
			flex: 0 0 16.66667%;
			max-width: 16.66667%;
		}
		.col-sm-3 {
			flex: 0 0 25%;
			max-width: 25%;
		}
		.col-sm-4 {
			flex: 0 0 33.33333%;
			max-width: 33.33333%;
		}
		.col-sm-5 {
			flex: 0 0 41.66667%;
			max-width: 41.66667%;
		}
		.col-sm-6 {
			flex: 0 0 50%;
			max-width: 50%;
		}
		.col-sm-7 {
			flex: 0 0 58.33333%;
			max-width: 58.33333%;
		}
		.col-sm-8 {
			flex: 0 0 66.66667%;
			max-width: 66.66667%;
		}
		.col-sm-9 {
			flex: 0 0 75%;
			max-width: 75%;
		}
		.col-sm-10 {
			flex: 0 0 83.33333%;
			max-width: 83.33333%;
		}
		.col-sm-11 {
			flex: 0 0 91.66667%;
			max-width: 91.66667%;
		}
		.col-sm-12 {
			flex: 0 0 100%;
			max-width: 100%;
		}
		.order-sm-first {
			order: -1;
		}
		.order-sm-last {
			order: 13;
		}
		.order-sm-0 {
			order: 0;
		}
		.order-sm-1 {
			order: 1;
		}
		.order-sm-2 {
			order: 2;
		}
		.order-sm-3 {
			order: 3;
		}
		.order-sm-4 {
			order: 4;
		}
		.order-sm-5 {
			order: 5;
		}
		.order-sm-6 {
			order: 6;
		}
		.order-sm-7 {
			order: 7;
		}
		.order-sm-8 {
			order: 8;
		}
		.order-sm-9 {
			order: 9;
		}
		.order-sm-10 {
			order: 10;
		}
		.order-sm-11 {
			order: 11;
		}
		.order-sm-12 {
			order: 12;
		}
		.offset-sm-0 {
			margin-left: 0;
		}
		.offset-sm-1 {
			margin-left: 8.33333%;
		}
		.offset-sm-2 {
			margin-left: 16.66667%;
		}
		.offset-sm-3 {
			margin-left: 25%;
		}
		.offset-sm-4 {
			margin-left: 33.33333%;
		}
		.offset-sm-5 {
			margin-left: 41.66667%;
		}
		.offset-sm-6 {
			margin-left: 50%;
		}
		.offset-sm-7 {
			margin-left: 58.33333%;
		}
		.offset-sm-8 {
			margin-left: 66.66667%;
		}
		.offset-sm-9 {
			margin-left: 75%;
		}
		.offset-sm-10 {
			margin-left: 83.33333%;
		}
		.offset-sm-11 {
			margin-left: 91.66667%;
		}
	}
	
	@media ( min-width : 768px) {
		.col-md {
			flex-basis: 0;
			flex-grow: 1;
			max-width: 100%;
		}
		.col-md-auto {
			flex: 0 0 auto;
			width: auto;
			max-width: none;
		}
		.col-md-1 {
			flex: 0 0 8.33333%;
			max-width: 8.33333%;
		}
		.col-md-2 {
			flex: 0 0 16.66667%;
			max-width: 16.66667%;
		}
		.col-md-3 {
			flex: 0 0 25%;
			max-width: 25%;
		}
		.col-md-4 {
			flex: 0 0 33.33333%;
			max-width: 33.33333%;
		}
		.col-md-5 {
			flex: 0 0 41.66667%;
			max-width: 41.66667%;
		}
		.col-md-6, .widget-advertisement .columns-2 .advertisement__item {
			flex: 0 0 50%;
			max-width: 50%;
		}
		.col-md-7 {
			flex: 0 0 58.33333%;
			max-width: 58.33333%;
		}
		.col-md-8 {
			flex: 0 0 66.66667%;
			max-width: 66.66667%;
		}
		.col-md-9 {
			flex: 0 0 75%;
			max-width: 75%;
		}
		.col-md-10 {
			flex: 0 0 83.33333%;
			max-width: 83.33333%;
		}
		.col-md-11 {
			flex: 0 0 91.66667%;
			max-width: 91.66667%;
		}
		.col-md-12, .widget-advertisement .columns-1 .advertisement__item {
			flex: 0 0 100%;
			max-width: 100%;
		}
		.order-md-first {
			order: -1;
		}
		.order-md-last {
			order: 13;
		}
		.order-md-0 {
			order: 0;
		}
		.order-md-1 {
			order: 1;
		}
		.order-md-2 {
			order: 2;
		}
		.order-md-3 {
			order: 3;
		}
		.order-md-4 {
			order: 4;
		}
		.order-md-5 {
			order: 5;
		}
		.order-md-6 {
			order: 6;
		}
		.order-md-7 {
			order: 7;
		}
		.order-md-8 {
			order: 8;
		}
		.order-md-9 {
			order: 9;
		}
		.order-md-10 {
			order: 10;
		}
		.order-md-11 {
			order: 11;
		}
		.order-md-12 {
			order: 12;
		}
		.offset-md-0 {
			margin-left: 0;
		}
		.offset-md-1 {
			margin-left: 8.33333%;
		}
		.offset-md-2 {
			margin-left: 16.66667%;
		}
		.offset-md-3 {
			margin-left: 25%;
		}
		.offset-md-4 {
			margin-left: 33.33333%;
		}
		.offset-md-5 {
			margin-left: 41.66667%;
		}
		.offset-md-6 {
			margin-left: 50%;
		}
		.offset-md-7 {
			margin-left: 58.33333%;
		}
		.offset-md-8 {
			margin-left: 66.66667%;
		}
		.offset-md-9 {
			margin-left: 75%;
		}
		.offset-md-10 {
			margin-left: 83.33333%;
		}
		.offset-md-11 {
			margin-left: 91.66667%;
		}
	}
	
	@media ( min-width : 992px) {
		.col-lg {
			flex-basis: 0;
			flex-grow: 1;
			max-width: 100%;
		}
		.col-lg-auto {
			flex: 0 0 auto;
			width: auto;
			max-width: none;
		}
		.col-lg-1 {
			flex: 0 0 8.33333%;
			max-width: 8.33333%;
		}
		.col-lg-2 {
			flex: 0 0 16.66667%;
			max-width: 16.66667%;
		}
		.col-lg-3 {
			flex: 0 0 25%;
			max-width: 25%;
		}
		.col-lg-4 {
			flex: 0 0 33.33333%;
			max-width: 33.33333%;
		}
		.col-lg-5 {
			flex: 0 0 41.66667%;
			max-width: 41.66667%;
		}
		.col-lg-6 {
			flex: 0 0 50%;
			max-width: 50%;
		}
		.col-lg-7 {
			flex: 0 0 58.33333%;
			max-width: 58.33333%;
		}
		.col-lg-8 {
			flex: 0 0 66.66667%;
			max-width: 66.66667%;
		}
		.col-lg-9 {
			flex: 0 0 75%;
			max-width: 75%;
		}
		.col-lg-10 {
			flex: 0 0 83.33333%;
			max-width: 83.33333%;
		}
		.col-lg-11 {
			flex: 0 0 91.66667%;
			max-width: 91.66667%;
		}
		.col-lg-12 {
			flex: 0 0 100%;
			max-width: 100%;
		}
		.order-lg-first {
			order: -1;
		}
		.order-lg-last {
			order: 13;
		}
		.order-lg-0 {
			order: 0;
		}
		.order-lg-1 {
			order: 1;
		}
		.order-lg-2 {
			order: 2;
		}
		.order-lg-3 {
			order: 3;
		}
		.order-lg-4 {
			order: 4;
		}
		.order-lg-5 {
			order: 5;
		}
		.order-lg-6 {
			order: 6;
		}
		.order-lg-7 {
			order: 7;
		}
		.order-lg-8 {
			order: 8;
		}
		.order-lg-9 {
			order: 9;
		}
		.order-lg-10 {
			order: 10;
		}
		.order-lg-11 {
			order: 11;
		}
		.order-lg-12 {
			order: 12;
		}
		.offset-lg-0 {
			margin-left: 0;
		}
		.offset-lg-1 {
			margin-left: 8.33333%;
		}
		.offset-lg-2 {
			margin-left: 16.66667%;
		}
		.offset-lg-3 {
			margin-left: 25%;
		}
		.offset-lg-4 {
			margin-left: 33.33333%;
		}
		.offset-lg-5 {
			margin-left: 41.66667%;
		}
		.offset-lg-6 {
			margin-left: 50%;
		}
		.offset-lg-7 {
			margin-left: 58.33333%;
		}
		.offset-lg-8 {
			margin-left: 66.66667%;
		}
		.offset-lg-9 {
			margin-left: 75%;
		}
		.offset-lg-10 {
			margin-left: 83.33333%;
		}
		.offset-lg-11 {
			margin-left: 91.66667%;
		}
	}
	
	@media ( min-width : 1200px) {
		.col-xl {
			flex-basis: 0;
			flex-grow: 1;
			max-width: 100%;
		}
		.col-xl-auto {
			flex: 0 0 auto;
			width: auto;
			max-width: none;
		}
		.col-xl-1 {
			flex: 0 0 8.33333%;
			max-width: 8.33333%;
		}
		.col-xl-2 {
			flex: 0 0 16.66667%;
			max-width: 16.66667%;
		}
		.col-xl-3 {
			flex: 0 0 25%;
			max-width: 25%;
		}
		.col-xl-4 {
			flex: 0 0 33.33333%;
			max-width: 33.33333%;
		}
		.col-xl-5 {
			flex: 0 0 41.66667%;
			max-width: 41.66667%;
		}
		.col-xl-6 {
			flex: 0 0 50%;
			max-width: 50%;
		}
		.col-xl-7 {
			flex: 0 0 58.33333%;
			max-width: 58.33333%;
		}
		.col-xl-8 {
			flex: 0 0 66.66667%;
			max-width: 66.66667%;
		}
		.col-xl-9 {
			flex: 0 0 75%;
			max-width: 75%;
		}
		.col-xl-10 {
			flex: 0 0 83.33333%;
			max-width: 83.33333%;
		}
		.col-xl-11 {
			flex: 0 0 91.66667%;
			max-width: 91.66667%;
		}
		.col-xl-12 {
			flex: 0 0 100%;
			max-width: 100%;
		}
		.order-xl-first {
			order: -1;
		}
		.order-xl-last {
			order: 13;
		}
		.order-xl-0 {
			order: 0;
		}
		.order-xl-1 {
			order: 1;
		}
		.order-xl-2 {
			order: 2;
		}
		.order-xl-3 {
			order: 3;
		}
		.order-xl-4 {
			order: 4;
		}
		.order-xl-5 {
			order: 5;
		}
		.order-xl-6 {
			order: 6;
		}
		.order-xl-7 {
			order: 7;
		}
		.order-xl-8 {
			order: 8;
		}
		.order-xl-9 {
			order: 9;
		}
		.order-xl-10 {
			order: 10;
		}
		.order-xl-11 {
			order: 11;
		}
		.order-xl-12 {
			order: 12;
		}
		.offset-xl-0 {
			margin-left: 0;
		}
		.offset-xl-1 {
			margin-left: 8.33333%;
		}
		.offset-xl-2 {
			margin-left: 16.66667%;
		}
		.offset-xl-3 {
			margin-left: 25%;
		}
		.offset-xl-4 {
			margin-left: 33.33333%;
		}
		.offset-xl-5 {
			margin-left: 41.66667%;
		}
		.offset-xl-6 {
			margin-left: 50%;
		}
		.offset-xl-7 {
			margin-left: 58.33333%;
		}
		.offset-xl-8 {
			margin-left: 66.66667%;
		}
		.offset-xl-9 {
			margin-left: 75%;
		}
		.offset-xl-10 {
			margin-left: 83.33333%;
		}
		.offset-xl-11 {
			margin-left: 91.66667%;
		}
	}
	
	.container-cart-form-btn {
		width: 100%;
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-box;
		display: -ms-flexbox;
		display: flex;
		flex-wrap: wrap;
		justify-content: center;
	}
	
	.cart-form-btn {
		font-family: "Open Sans", sans-serif;
		font-size: 16px;
		color: #545454;
		line-height: 1.2;
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-box;
		display: -ms-flexbox;
		display: flex;
		justify-content: center;
		align-items: center;
		padding: 0 20px;
		min-width: 120px;
		height: 50px;
		border-radius: 25px;
		background: #545454;
		background: -webkit-linear-gradient(bottom, #545454, #545454);
		background: -o-linear-gradient(bottom, #545454, #545454);
		background: -moz-linear-gradient(bottom, #545454, #545454);
		background: linear-gradient(bottom, #545454, #545454);
		position: relative;
		z-index: 1;
		-webkit-transition: all 0.4s;
		-o-transition: all 0.4s;
		-moz-transition: all 0.4s;
		transition: all 0.4s;
	}
	
	.cart-form-btn::before {
		content: "";
		display: block;
		position: absolute;
		z-index: -1;
		width: 100%;
		height: 100%;
		border-radius: 25px;
		background-color: #fff;
		top: 0;
		left: 0;
		opacity: 1;
		-webkit-transition: all 0.4s;
		-o-transition: all 0.4s;
		-moz-transition: all 0.4s;
		transition: all 0.4s;
	}
	
	.cart-form-btn:hover {
		color: #fff;
	}
	
	.cart-form-btn:hover:before {
		opacity: 0;
	}
	
	a.btns .disabled, fieldset:disabled a.btns {
		pointer-events: none;
	}
	
	.fade {
		opacity: 0;
		transition: opacity 0.15s linear;
	}
	
	.fade.show {
		opacity: 1;
	}
	
	.collapse {
		display: none;
	}
	
	.collapse.show {
		display: block;
	}
	
	.pagination {
		display: flex;
		padding-left: 0;
		list-style: none;
		border-radius: 0;
	}
	
	.border {
		border: 1px solid #e1e1e1 !important;
	}
	
	.border-top {
		border-top: 1px solid #e1e1e1 !important;
	}
	
	.border-right {
		border-right: 1px solid #e1e1e1 !important;
	}
	
	.border-bottom {
		border-bottom: 1px solid #e1e1e1 !important;
	}
	
	.border-left {
		border-left: 1px solid #e1e1e1 !important;
	}
	
	.border-0 {
		border: 0 !important;
	}
	
	.border-top-0 {
		border-top: 0 !important;
	}
	
	.border-right-0 {
		border-right: 0 !important;
	}
	
	.border-bottom-0 {
		border-bottom: 0 !important;
	}
	
	.border-left-0 {
		border-left: 0 !important;
	}
	
	.border-primary {
		border-color: #ffbc12 !important;
	}
	
	.border-secondary {
		border-color: #6c757d !important;
	}
	
	.border-success {
		border-color: #28a745 !important;
	}
	
	.border-info {
		border-color: #17a2b8 !important;
	}
	
	.border-warning {
		border-color: #ffc107 !important;
	}
	
	.border-danger {
		border-color: #dc3545 !important;
	}
	
	.border-light {
		border-color: #f8f9fa !important;
	}
	
	.border-dark {
		border-color: #343a40 !important;
	}
	
	.border-white {
		border-color: #fff !important;
	}
	
	.rounded {
		border-radius: 0 !important;
	}
	
	.rounded-top {
		border-top-left-radius: 0 !important;
		border-top-right-radius: 0 !important;
	}
	
	.rounded-right {
		border-top-right-radius: 0 !important;
		border-bottom-right-radius: 0 !important;
	}
	
	.rounded-bottom {
		border-bottom-right-radius: 0 !important;
		border-bottom-left-radius: 0 !important;
	}
	
	.rounded-left {
		border-top-left-radius: 0 !important;
		border-bottom-left-radius: 0 !important;
	}
	
	.rounded-circle {
		border-radius: 50% !important;
	}
	
	.rounded-0 {
		border-radius: 0 !important;
	}
	
	.clearfix::after {
		display: block;
		clear: both;
		content: "";
	}
	
	.d-none {
		display: none !important;
	}
	
	.d-inline {
		display: inline !important;
	}
	
	.d-inline-block {
		display: inline-block !important;
	}
	
	.d-block {
		display: block !important;
	}
	
	.d-table {
		display: table !important;
	}
	
	.d-table-row {
		display: table-row !important;
	}
	
	.d-table-cell {
		display: table-cell !important;
	}
	
	.d-flex {
		display: flex !important;
	}
	
	.d-inline-flex {
		display: inline-flex !important;
	}
	
	@media ( min-width : 576px) {
		.d-sm-none {
			display: none !important;
		}
		.d-sm-inline {
			display: inline !important;
		}
		.d-sm-inline-block {
			display: inline-block !important;
		}
		.d-sm-block {
			display: block !important;
		}
		.d-sm-table {
			display: table !important;
		}
		.d-sm-table-row {
			display: table-row !important;
		}
		.d-sm-table-cell {
			display: table-cell !important;
		}
		.d-sm-flex {
			display: flex !important;
		}
		.d-sm-inline-flex {
			display: inline-flex !important;
		}
	}
	
	@media ( min-width : 768px) {
		.d-md-none {
			display: none !important;
		}
		.d-md-inline {
			display: inline !important;
		}
		.d-md-inline-block {
			display: inline-block !important;
		}
		.d-md-block {
			display: block !important;
		}
		.d-md-table {
			display: table !important;
		}
		.d-md-table-row {
			display: table-row !important;
		}
		.d-md-table-cell {
			display: table-cell !important;
		}
		.d-md-flex {
			display: flex !important;
		}
		.d-md-inline-flex {
			display: inline-flex !important;
		}
	}
	
	@media ( min-width : 992px) {
		.d-lg-none {
			display: none !important;
		}
		.d-lg-inline {
			display: inline !important;
		}
		.d-lg-inline-block {
			display: inline-block !important;
		}
		.d-lg-block {
			display: block !important;
		}
		.d-lg-table {
			display: table !important;
		}
		.d-lg-table-row {
			display: table-row !important;
		}
		.d-lg-table-cell {
			display: table-cell !important;
		}
		.d-lg-flex {
			display: flex !important;
		}
		.d-lg-inline-flex {
			display: inline-flex !important;
		}
	}
	
	@media ( min-width : 1200px) {
		.d-xl-none {
			display: none !important;
		}
		.d-xl-inline {
			display: inline !important;
		}
		.d-xl-inline-block {
			display: inline-block !important;
		}
		.d-xl-block {
			display: block !important;
		}
		.d-xl-table {
			display: table !important;
		}
		.d-xl-table-row {
			display: table-row !important;
		}
		.d-xl-table-cell {
			display: table-cell !important;
		}
		.d-xl-flex {
			display: flex !important;
		}
		.d-xl-inline-flex {
			display: inline-flex !important;
		}
	}
	
	@media print {
		.d-print-none {
			display: none !important;
		}
		.d-print-inline {
			display: inline !important;
		}
		.d-print-inline-block {
			display: inline-block !important;
		}
		.d-print-block {
			display: block !important;
		}
		.d-print-table {
			display: table !important;
		}
		.d-print-table-row {
			display: table-row !important;
		}
		.d-print-table-cell {
			display: table-cell !important;
		}
		.d-print-flex {
			display: flex !important;
		}
		.d-print-inline-flex {
			display: inline-flex !important;
		}
	}
	
	.embed-responsive {
		position: relative;
		display: block;
		width: 100%;
		padding: 0;
		overflow: hidden;
	}
	
	.embed-responsive::before {
		display: block;
		content: "";
	}
	
	.embed-responsive .embed-responsive-item, .embed-responsive iframe,
		.embed-responsive embed, .embed-responsive object, .embed-responsive video
		{
		position: absolute;
		top: 0;
		bottom: 0;
		left: 0;
		width: 100%;
		height: 100%;
		border: 0;
	}
	
	.embed-responsive-21by9::before {
		padding-top: 42.85714%;
	}
	
	.embed-responsive-16by9::before {
		padding-top: 56.25%;
	}
	
	.embed-responsive-4by3::before {
		padding-top: 75%;
	}
	
	.embed-responsive-1by1::before {
		padding-top: 100%;
	}
	
	.flex-row {
		flex-direction: row !important;
	}
	
	.flex-column {
		flex-direction: column !important;
	}
	
	.flex-row-reverse {
		flex-direction: row-reverse !important;
	}
	
	.flex-column-reverse {
		flex-direction: column-reverse !important;
	}
	
	.flex-wrap {
		flex-wrap: wrap !important;
	}
	
	.flex-nowrap {
		flex-wrap: nowrap !important;
	}
	
	.flex-wrap-reverse {
		flex-wrap: wrap-reverse !important;
	}
	
	.justify-content-start {
		justify-content: flex-start !important;
	}
	
	.justify-content-end {
		justify-content: flex-end !important;
	}
	
	.justify-content-center {
		justify-content: center !important;
	}
	
	.justify-content-around {
		justify-content: space-around !important;
	}
	
	.align-items-start {
		align-items: flex-start !important;
	}
	
	.align-items-end {
		align-items: flex-end !important;
	}
	
	.align-items-center {
		align-items: center !important;
	}
	
	.align-items-baseline {
		align-items: baseline !important;
	}
	
	.align-items-stretch {
		align-items: stretch !important;
	}
	
	.align-content-start {
		align-content: flex-start !important;
	}
	
	.align-content-end {
		align-content: flex-end !important;
	}
	
	.align-content-center {
		align-content: center !important;
	}
	
	.align-content-between {
		align-content: space-between !important;
	}
	
	.align-content-around {
		align-content: space-around !important;
	}
	
	.align-content-stretch {
		align-content: stretch !important;
	}
	
	.align-self-auto {
		align-self: auto !important;
	}
	
	.align-self-start {
		align-self: flex-start !important;
	}
	
	.align-self-end {
		align-self: flex-end !important;
	}
	
	.align-self-center {
		align-self: center !important;
	}
	
	.align-self-baseline {
		align-self: baseline !important;
	}
	
	.align-self-stretch {
		align-self: stretch !important;
	}
	
	@media ( min-width : 576px) {
		.flex-sm-row {
			flex-direction: row !important;
		}
		.flex-sm-column {
			flex-direction: column !important;
		}
		.flex-sm-row-reverse {
			flex-direction: row-reverse !important;
		}
		.flex-sm-column-reverse {
			flex-direction: column-reverse !important;
		}
		.flex-sm-wrap {
			flex-wrap: wrap !important;
		}
		.flex-sm-nowrap {
			flex-wrap: nowrap !important;
		}
		.flex-sm-wrap-reverse {
			flex-wrap: wrap-reverse !important;
		}
		.justify-content-sm-start {
			justify-content: flex-start !important;
		}
		.justify-content-sm-end {
			justify-content: flex-end !important;
		}
		.justify-content-sm-center {
			justify-content: center !important;
		}
		.justify-content-sm-between {
			justify-content: space-between !important;
		}
		.justify-content-sm-around {
			justify-content: space-around !important;
		}
		.align-items-sm-start {
			align-items: flex-start !important;
		}
		.align-items-sm-end {
			align-items: flex-end !important;
		}
		.align-items-sm-center {
			align-items: center !important;
		}
		.align-items-sm-baseline {
			align-items: baseline !important;
		}
		.align-items-sm-stretch {
			align-items: stretch !important;
		}
		.align-content-sm-start {
			align-content: flex-start !important;
		}
		.align-content-sm-end {
			align-content: flex-end !important;
		}
		.align-content-sm-center {
			align-content: center !important;
		}
		.align-content-sm-between {
			align-content: space-between !important;
		}
		.align-content-sm-around {
			align-content: space-around !important;
		}
		.align-content-sm-stretch {
			align-content: stretch !important;
		}
		.align-self-sm-auto {
			align-self: auto !important;
		}
		.align-self-sm-start {
			align-self: flex-start !important;
		}
		.align-self-sm-end {
			align-self: flex-end !important;
		}
		.align-self-sm-center {
			align-self: center !important;
		}
		.align-self-sm-baseline {
			align-self: baseline !important;
		}
		.align-self-sm-stretch {
			align-self: stretch !important;
		}
	}
	
	@media ( min-width : 768px) {
		.flex-md-row {
			flex-direction: row !important;
		}
		.flex-md-column {
			flex-direction: column !important;
		}
		.flex-md-row-reverse {
			flex-direction: row-reverse !important;
		}
		.flex-md-column-reverse {
			flex-direction: column-reverse !important;
		}
		.flex-md-wrap {
			flex-wrap: wrap !important;
		}
		.flex-md-nowrap {
			flex-wrap: nowrap !important;
		}
		.flex-md-wrap-reverse {
			flex-wrap: wrap-reverse !important;
		}
		.justify-content-md-start {
			justify-content: flex-start !important;
		}
		.justify-content-md-end {
			justify-content: flex-end !important;
		}
		.justify-content-md-center {
			justify-content: center !important;
		}
		.justify-content-md-between {
			justify-content: space-between !important;
		}
		.justify-content-md-around {
			justify-content: space-around !important;
		}
		.align-items-md-start {
			align-items: flex-start !important;
		}
		.align-items-md-end {
			align-items: flex-end !important;
		}
		.align-items-md-center {
			align-items: center !important;
		}
		.align-items-md-baseline {
			align-items: baseline !important;
		}
		.align-items-md-stretch {
			align-items: stretch !important;
		}
		.align-content-md-start {
			align-content: flex-start !important;
		}
		.align-content-md-end {
			align-content: flex-end !important;
		}
		.align-content-md-center {
			align-content: center !important;
		}
		.align-content-md-between {
			align-content: space-between !important;
		}
		.align-content-md-around {
			align-content: space-around !important;
		}
		.align-content-md-stretch {
			align-content: stretch !important;
		}
		.align-self-md-auto {
			align-self: auto !important;
		}
		.align-self-md-start {
			align-self: flex-start !important;
		}
		.align-self-md-end {
			align-self: flex-end !important;
		}
		.align-self-md-center {
			align-self: center !important;
		}
		.align-self-md-baseline {
			align-self: baseline !important;
		}
		.align-self-md-stretch {
			align-self: stretch !important;
		}
	}
	
	@media ( min-width : 992px) {
		.flex-lg-row {
			flex-direction: row !important;
		}
		.flex-lg-column {
			flex-direction: column !important;
		}
		.flex-lg-row-reverse {
			flex-direction: row-reverse !important;
		}
		.flex-lg-column-reverse {
			flex-direction: column-reverse !important;
		}
		.flex-lg-wrap {
			flex-wrap: wrap !important;
		}
		.flex-lg-nowrap {
			flex-wrap: nowrap !important;
		}
		.flex-lg-wrap-reverse {
			flex-wrap: wrap-reverse !important;
		}
		.justify-content-lg-start {
			justify-content: flex-start !important;
		}
		.justify-content-lg-end {
			justify-content: flex-end !important;
		}
		.justify-content-lg-center {
			justify-content: center !important;
		}
		.justify-content-lg-between {
			justify-content: space-between !important;
		}
		.justify-content-lg-around {
			justify-content: space-around !important;
		}
		.align-items-lg-start {
			align-items: flex-start !important;
		}
		.align-items-lg-end {
			align-items: flex-end !important;
		}
		.align-items-lg-center {
			align-items: center !important;
		}
		.align-items-lg-baseline {
			align-items: baseline !important;
		}
		.align-items-lg-stretch {
			align-items: stretch !important;
		}
		.align-content-lg-start {
			align-content: flex-start !important;
		}
		.align-content-lg-end {
			align-content: flex-end !important;
		}
		.align-content-lg-center {
			align-content: center !important;
		}
		.align-content-lg-between {
			align-content: space-between !important;
		}
		.align-content-lg-around {
			align-content: space-around !important;
		}
		.align-content-lg-stretch {
			align-content: stretch !important;
		}
		.align-self-lg-auto {
			align-self: auto !important;
		}
		.align-self-lg-start {
			align-self: flex-start !important;
		}
		.align-self-lg-end {
			align-self: flex-end !important;
		}
		.align-self-lg-center {
			align-self: center !important;
		}
		.align-self-lg-baseline {
			align-self: baseline !important;
		}
		.align-self-lg-stretch {
			align-self: stretch !important;
		}
	}
	
	@media ( min-width : 1200px) {
		.flex-xl-row {
			flex-direction: row !important;
		}
		.flex-xl-column {
			flex-direction: column !important;
		}
		.flex-xl-row-reverse {
			flex-direction: row-reverse !important;
		}
		.flex-xl-column-reverse {
			flex-direction: column-reverse !important;
		}
		.flex-xl-wrap {
			flex-wrap: wrap !important;
		}
		.flex-xl-nowrap {
			flex-wrap: nowrap !important;
		}
		.flex-xl-wrap-reverse {
			flex-wrap: wrap-reverse !important;
		}
		.justify-content-xl-start {
			justify-content: flex-start !important;
		}
		.justify-content-xl-end {
			justify-content: flex-end !important;
		}
		.justify-content-xl-center {
			justify-content: center !important;
		}
		.justify-content-xl-between {
			justify-content: space-between !important;
		}
		.justify-content-xl-around {
			justify-content: space-around !important;
		}
		.align-items-xl-start {
			align-items: flex-start !important;
		}
		.align-items-xl-end {
			align-items: flex-end !important;
		}
		.align-items-xl-center {
			align-items: center !important;
		}
		.align-items-xl-baseline {
			align-items: baseline !important;
		}
		.align-items-xl-stretch {
			align-items: stretch !important;
		}
		.align-content-xl-start {
			align-content: flex-start !important;
		}
		.align-content-xl-end {
			align-content: flex-end !important;
		}
		.align-content-xl-center {
			align-content: center !important;
		}
		.align-content-xl-between {
			align-content: space-between !important;
		}
		.align-content-xl-around {
			align-content: space-around !important;
		}
		.align-content-xl-stretch {
			align-content: stretch !important;
		}
		.align-self-xl-auto {
			align-self: auto !important;
		}
		.align-self-xl-start {
			align-self: flex-start !important;
		}
		.align-self-xl-end {
			align-self: flex-end !important;
		}
		.align-self-xl-center {
			align-self: center !important;
		}
		.align-self-xl-baseline {
			align-self: baseline !important;
		}
		.align-self-xl-stretch {
			align-self: stretch !important;
		}
	}
	
	.float-left {
		float: left !important;
	}
	
	.float-right {
		float: right !important;
	}
	
	.float-none {
		float: none !important;
	}
	
	@media ( min-width : 576px) {
		.float-sm-left {
			float: left !important;
		}
		.float-sm-right {
			float: right !important;
		}
		.float-sm-none {
			float: none !important;
		}
	}
	
	@media ( min-width : 768px) {
		.float-md-left {
			float: left !important;
		}
		.float-md-right {
			float: right !important;
		}
		.float-md-none {
			float: none !important;
		}
	}
	
	@media ( min-width : 992px) {
		.float-lg-left {
			float: left !important;
		}
		.float-lg-right {
			float: right !important;
		}
		.float-lg-none {
			float: none !important;
		}
	}
	
	@media ( min-width : 1200px) {
		.float-xl-left {
			float: left !important;
		}
		.float-xl-right {
			float: right !important;
		}
		.float-xl-none {
			float: none !important;
		}
	}
	
	.position-static {
		position: static !important;
	}
	
	.position-relative {
		position: relative !important;
	}
	
	.position-absolute {
		position: absolute !important;
	}
	
	.position-fixed {
		position: fixed !important;
	}
	
	.position-sticky {
		position: sticky !important;
	}
	
	.fixed-top {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		z-index: 1030;
	}
	
	.fixed-bottom {
		position: fixed;
		right: 0;
		bottom: 0;
		left: 0;
		z-index: 1030;
	}
	
	@
	supports (position: sticky ) { .sticky-top { position:sticky;
		top: 0;
		z-index: 1020;
	}
	
	}
	.sr-only {
		position: absolute;
		width: 1px;
		height: 1px;
		padding: 0;
		overflow: hidden;
		clip: rect(0, 0, 0, 0);
		white-space: nowrap;
		clip-path: inset(50%);
		border: 0;
	}
	
	.sr-only-focusable:active, .sr-only-focusable:focus {
		position: static;
		width: auto;
		height: auto;
		overflow: visible;
		clip: auto;
		white-space: normal;
		clip-path: none;
	}
	
	.w-25 {
		width: 25% !important;
	}
	
	.w-50 {
		width: 50% !important;
	}
	
	.w-75 {
		width: 75% !important;
	}
	
	.w-100 {
		width: 100% !important;
	}
	
	.h-25 {
		height: 25% !important;
	}
	
	.h-50 {
		height: 50% !important;
	}
	
	.h-75 {
		height: 75% !important;
	}
	
	.h-100 {
		height: 100% !important;
	}
	
	.mw-100 {
		max-width: 100% !important;
	}
	
	.mh-100 {
		max-height: 100% !important;
	}
	
	.m-0 {
		margin: 0 !important;
	}
	
	.mt-0, .my-0 {
		margin-top: 0 !important;
	}
	
	.mr-0, .mx-0 {
		margin-right: 0 !important;
	}
	
	.mb-0, .my-0 {
		margin-bottom: 0 !important;
	}
	
	.ml-0, .mx-0 {
		margin-left: 0 !important;
	}
	
	.m-1 {
		margin: 0.25rem !important;
	}
	
	.mt-1, .my-1 {
		margin-top: 0.25rem !important;
	}
	
	.mr-1, .mx-1 {
		margin-right: 0.25rem !important;
	}
	
	.mb-1, .my-1 {
		margin-bottom: 0.25rem !important;
	}
	
	.ml-1, .mx-1 {
		margin-left: 0.25rem !important;
	}
	
	.m-2 {
		margin: 0.5rem !important;
	}
	
	.mt-2, .my-2 {
		margin-top: 0.5rem !important;
	}
	
	.mr-2, .mx-2 {
		margin-right: 0.5rem !important;
	}
	
	.mb-2, .my-2 {
		margin-bottom: 0.5rem !important;
	}
	
	.ml-2, .mx-2 {
		margin-left: 0.5rem !important;
	}
	
	.m-3 {
		margin: 1rem !important;
	}
	
	.mt-3, .my-3 {
		margin-top: 1rem !important;
	}
	
	.mr-3, .mx-3 {
		margin-right: 1rem !important;
	}
	
	.mb-3, .my-3 {
		margin-bottom: 1rem !important;
	}
	
	.ml-3, .mx-3 {
		margin-left: 1rem !important;
	}
	
	.m-4 {
		margin: 1.5rem !important;
	}
	
	.mt-4, .my-4 {
		margin-top: 1.5rem !important;
	}
	
	.mr-4, .mx-4 {
		margin-right: 1.5rem !important;
	}
	
	.mb-4, .my-4 {
		margin-bottom: 1.5rem !important;
	}
	
	.ml-4, .mx-4 {
		margin-left: 1.5rem !important;
	}
	
	.m-5 {
		margin: 3rem !important;
	}
	
	.mt-5, .my-5 {
		margin-top: 3rem !important;
	}
	
	.mr-5, .mx-5 {
		margin-right: 3rem !important;
	}
	
	.mb-5, .my-5 {
		margin-bottom: 3rem !important;
	}
	
	.ml-5, .mx-5 {
		margin-left: 3rem !important;
	}
	
	.p-0 {
		padding: 0 !important;
	}
	
	.pt-0, .py-0 {
		padding-top: 0 !important;
	}
	
	.pr-0, .px-0 {
		padding-right: 0 !important;
	}
	
	.pb-0, .py-0 {
		padding-bottom: 0 !important;
	}
	
	.pl-0, .px-0 {
		padding-left: 0 !important;
	}
	
	.p-1 {
		padding: 0.25rem !important;
	}
	
	.pt-1, .py-1 {
		padding-top: 0.25rem !important;
	}
	
	.pr-1, .px-1 {
		padding-right: 0.25rem !important;
	}
	
	.pb-1, .py-1 {
		padding-bottom: 0.25rem !important;
	}
	
	.pl-1, .px-1 {
		padding-left: 0.25rem !important;
	}
	
	.p-2 {
		padding: 0.5rem !important;
	}
	
	.pt-2, .py-2 {
		padding-top: 0.5rem !important;
	}
	
	.pr-2, .px-2 {
		padding-right: 0.5rem !important;
	}
	
	.pb-2, .py-2 {
		padding-bottom: 0.5rem !important;
	}
	
	.pl-2, .px-2 {
		padding-left: 0.5rem !important;
	}
	
	.p-3 {
		padding: 1rem !important;
	}
	
	.pt-3, .py-3 {
		padding-top: 1rem !important;
	}
	
	.pr-3, .px-3 {
		padding-right: 1rem !important;
	}
	
	.pb-3, .py-3 {
		padding-bottom: 1rem !important;
	}
	
	.pl-3, .px-3 {
		padding-left: 1rem !important;
	}
	
	.p-4 {
		padding: 1.5rem !important;
	}
	
	.pt-4, .py-4 {
		padding-top: 1.5rem !important;
	}
	
	.pr-4, .px-4 {
		padding-right: 1.5rem !important;
	}
	
	.pb-4, .py-4 {
		padding-bottom: 1.5rem !important;
	}
	
	.pl-4, .px-4 {
		padding-left: 1.5rem !important;
	}
	
	.p-5 {
		padding: 3rem !important;
	}
	
	.pt-5, .py-5 {
		padding-top: 3rem !important;
	}
	
	.pr-5, .px-5 {
		padding-right: 3rem !important;
	}
	
	.pb-5, .py-5 {
		padding-bottom: 3rem !important;
	}
	
	.pl-5, .px-5 {
		padding-left: 3rem !important;
	}
	
	.m-auto {
		margin: auto !important;
	}
	
	.mt-auto, .my-auto {
		margin-top: auto !important;
	}
	
	.mr-auto, .mx-auto {
		margin-right: auto !important;
	}
	
	.mb-auto, .my-auto {
		margin-bottom: auto !important;
	}
	
	.ml-auto, .mx-auto {
		margin-left: auto !important;
	}
	
	@media ( min-width : 576px) {
		.m-sm-0 {
			margin: 0 !important;
		}
		.mt-sm-0, .my-sm-0 {
			margin-top: 0 !important;
		}
		.mr-sm-0, .mx-sm-0 {
			margin-right: 0 !important;
		}
		.mb-sm-0, .my-sm-0 {
			margin-bottom: 0 !important;
		}
		.ml-sm-0, .mx-sm-0 {
			margin-left: 0 !important;
		}
		.m-sm-1 {
			margin: 0.25rem !important;
		}
		.mt-sm-1, .my-sm-1 {
			margin-top: 0.25rem !important;
		}
		.mr-sm-1, .mx-sm-1 {
			margin-right: 0.25rem !important;
		}
		.mb-sm-1, .my-sm-1 {
			margin-bottom: 0.25rem !important;
		}
		.ml-sm-1, .mx-sm-1 {
			margin-left: 0.25rem !important;
		}
		.m-sm-2 {
			margin: 0.5rem !important;
		}
		.mt-sm-2, .my-sm-2 {
			margin-top: 0.5rem !important;
		}
		.mr-sm-2, .mx-sm-2 {
			margin-right: 0.5rem !important;
		}
		.mb-sm-2, .my-sm-2 {
			margin-bottom: 0.5rem !important;
		}
		.ml-sm-2, .mx-sm-2 {
			margin-left: 0.5rem !important;
		}
		.m-sm-3 {
			margin: 1rem !important;
		}
		.mt-sm-3, .my-sm-3 {
			margin-top: 1rem !important;
		}
		.mr-sm-3, .mx-sm-3 {
			margin-right: 1rem !important;
		}
		.mb-sm-3, .my-sm-3 {
			margin-bottom: 1rem !important;
		}
		.ml-sm-3, .mx-sm-3 {
			margin-left: 1rem !important;
		}
		.m-sm-4 {
			margin: 1.5rem !important;
		}
		.mt-sm-4, .my-sm-4 {
			margin-top: 1.5rem !important;
		}
		.mr-sm-4, .mx-sm-4 {
			margin-right: 1.5rem !important;
		}
		.mb-sm-4, .my-sm-4 {
			margin-bottom: 1.5rem !important;
		}
		.ml-sm-4, .mx-sm-4 {
			margin-left: 1.5rem !important;
		}
		.m-sm-5 {
			margin: 3rem !important;
		}
		.mt-sm-5, .my-sm-5 {
			margin-top: 3rem !important;
		}
		.mr-sm-5, .mx-sm-5 {
			margin-right: 3rem !important;
		}
		.mb-sm-5, .my-sm-5 {
			margin-bottom: 3rem !important;
		}
		.ml-sm-5, .mx-sm-5 {
			margin-left: 3rem !important;
		}
		.p-sm-0 {
			padding: 0 !important;
		}
		.pt-sm-0, .py-sm-0 {
			padding-top: 0 !important;
		}
		.pr-sm-0, .px-sm-0 {
			padding-right: 0 !important;
		}
		.pb-sm-0, .py-sm-0 {
			padding-bottom: 0 !important;
		}
		.pl-sm-0, .px-sm-0 {
			padding-left: 0 !important;
		}
		.p-sm-1 {
			padding: 0.25rem !important;
		}
		.pt-sm-1, .py-sm-1 {
			padding-top: 0.25rem !important;
		}
		.pr-sm-1, .px-sm-1 {
			padding-right: 0.25rem !important;
		}
		.pb-sm-1, .py-sm-1 {
			padding-bottom: 0.25rem !important;
		}
		.pl-sm-1, .px-sm-1 {
			padding-left: 0.25rem !important;
		}
		.p-sm-2 {
			padding: 0.5rem !important;
		}
		.pt-sm-2, .py-sm-2 {
			padding-top: 0.5rem !important;
		}
		.pr-sm-2, .px-sm-2 {
			padding-right: 0.5rem !important;
		}
		.pb-sm-2, .py-sm-2 {
			padding-bottom: 0.5rem !important;
		}
		.pl-sm-2, .px-sm-2 {
			padding-left: 0.5rem !important;
		}
		.p-sm-3 {
			padding: 1rem !important;
		}
		.pt-sm-3, .py-sm-3 {
			padding-top: 1rem !important;
		}
		.pr-sm-3, .px-sm-3 {
			padding-right: 1rem !important;
		}
		.pb-sm-3, .py-sm-3 {
			padding-bottom: 1rem !important;
		}
		.pl-sm-3, .px-sm-3 {
			padding-left: 1rem !important;
		}
		.p-sm-4 {
			padding: 1.5rem !important;
		}
		.pt-sm-4, .py-sm-4 {
			padding-top: 1.5rem !important;
		}
		.pr-sm-4, .px-sm-4 {
			padding-right: 1.5rem !important;
		}
		.pb-sm-4, .py-sm-4 {
			padding-bottom: 1.5rem !important;
		}
		.pl-sm-4, .px-sm-4 {
			padding-left: 1.5rem !important;
		}
		.p-sm-5 {
			padding: 3rem !important;
		}
		.pt-sm-5, .py-sm-5 {
			padding-top: 3rem !important;
		}
		.pr-sm-5, .px-sm-5 {
			padding-right: 3rem !important;
		}
		.pb-sm-5, .py-sm-5 {
			padding-bottom: 3rem !important;
		}
		.pl-sm-5, .px-sm-5 {
			padding-left: 3rem !important;
		}
		.m-sm-auto {
			margin: auto !important;
		}
		.mt-sm-auto, .my-sm-auto {
			margin-top: auto !important;
		}
		.mr-sm-auto, .mx-sm-auto {
			margin-right: auto !important;
		}
		.mb-sm-auto, .my-sm-auto {
			margin-bottom: auto !important;
		}
		.ml-sm-auto, .mx-sm-auto {
			margin-left: auto !important;
		}
	}
	
	@media ( min-width : 768px) {
		.m-md-0 {
			margin: 0 !important;
		}
		.mt-md-0, .my-md-0 {
			margin-top: 0 !important;
		}
		.mr-md-0, .mx-md-0 {
			margin-right: 0 !important;
		}
		.mb-md-0, .my-md-0 {
			margin-bottom: 0 !important;
		}
		.ml-md-0, .mx-md-0 {
			margin-left: 0 !important;
		}
		.m-md-1 {
			margin: 0.25rem !important;
		}
		.mt-md-1, .my-md-1 {
			margin-top: 0.25rem !important;
		}
		.mr-md-1, .mx-md-1 {
			margin-right: 0.25rem !important;
		}
		.mb-md-1, .my-md-1 {
			margin-bottom: 0.25rem !important;
		}
		.ml-md-1, .mx-md-1 {
			margin-left: 0.25rem !important;
		}
		.m-md-2 {
			margin: 0.5rem !important;
		}
		.mt-md-2, .my-md-2 {
			margin-top: 0.5rem !important;
		}
		.mr-md-2, .mx-md-2 {
			margin-right: 0.5rem !important;
		}
		.mb-md-2, .my-md-2 {
			margin-bottom: 0.5rem !important;
		}
		.ml-md-2, .mx-md-2 {
			margin-left: 0.5rem !important;
		}
		.m-md-3 {
			margin: 1rem !important;
		}
		.mt-md-3, .my-md-3 {
			margin-top: 1rem !important;
		}
		.mr-md-3, .mx-md-3 {
			margin-right: 1rem !important;
		}
		.mb-md-3, .my-md-3 {
			margin-bottom: 1rem !important;
		}
		.ml-md-3, .mx-md-3 {
			margin-left: 1rem !important;
		}
		.m-md-4 {
			margin: 1.5rem !important;
		}
		.mt-md-4, .my-md-4 {
			margin-top: 1.5rem !important;
		}
		.mr-md-4, .mx-md-4 {
			margin-right: 1.5rem !important;
		}
		.mb-md-4, .my-md-4 {
			margin-bottom: 1.5rem !important;
		}
		.ml-md-4, .mx-md-4 {
			margin-left: 1.5rem !important;
		}
		.m-md-5 {
			margin: 3rem !important;
		}
		.mt-md-5, .my-md-5 {
			margin-top: 3rem !important;
		}
		.mr-md-5, .mx-md-5 {
			margin-right: 3rem !important;
		}
		.mb-md-5, .my-md-5 {
			margin-bottom: 3rem !important;
		}
		.ml-md-5, .mx-md-5 {
			margin-left: 3rem !important;
		}
		.p-md-0 {
			padding: 0 !important;
		}
		.pt-md-0, .py-md-0 {
			padding-top: 0 !important;
		}
		.pr-md-0, .px-md-0 {
			padding-right: 0 !important;
		}
		.pb-md-0, .py-md-0 {
			padding-bottom: 0 !important;
		}
		.pl-md-0, .px-md-0 {
			padding-left: 0 !important;
		}
		.p-md-1 {
			padding: 0.25rem !important;
		}
		.pt-md-1, .py-md-1 {
			padding-top: 0.25rem !important;
		}
		.pr-md-1, .px-md-1 {
			padding-right: 0.25rem !important;
		}
		.pb-md-1, .py-md-1 {
			padding-bottom: 0.25rem !important;
		}
		.pl-md-1, .px-md-1 {
			padding-left: 0.25rem !important;
		}
		.p-md-2 {
			padding: 0.5rem !important;
		}
		.pt-md-2, .py-md-2 {
			padding-top: 0.5rem !important;
		}
		.pr-md-2, .px-md-2 {
			padding-right: 0.5rem !important;
		}
		.pb-md-2, .py-md-2 {
			padding-bottom: 0.5rem !important;
		}
		.pl-md-2, .px-md-2 {
			padding-left: 0.5rem !important;
		}
		.p-md-3 {
			padding: 1rem !important;
		}
		.pt-md-3, .py-md-3 {
			padding-top: 1rem !important;
		}
		.pr-md-3, .px-md-3 {
			padding-right: 1rem !important;
		}
		.pb-md-3, .py-md-3 {
			padding-bottom: 1rem !important;
		}
		.pl-md-3, .px-md-3 {
			padding-left: 1rem !important;
		}
		.p-md-4 {
			padding: 1.5rem !important;
		}
		.pt-md-4, .py-md-4 {
			padding-top: 1.5rem !important;
		}
		.pr-md-4, .px-md-4 {
			padding-right: 1.5rem !important;
		}
		.pb-md-4, .py-md-4 {
			padding-bottom: 1.5rem !important;
		}
		.pl-md-4, .px-md-4 {
			padding-left: 1.5rem !important;
		}
		.p-md-5 {
			padding: 3rem !important;
		}
		.pt-md-5, .py-md-5 {
			padding-top: 3rem !important;
		}
		.pr-md-5, .px-md-5 {
			padding-right: 3rem !important;
		}
		.pb-md-5, .py-md-5 {
			padding-bottom: 3rem !important;
		}
		.pl-md-5, .px-md-5 {
			padding-left: 3rem !important;
		}
		.m-md-auto {
			margin: auto !important;
		}
		.mt-md-auto, .my-md-auto {
			margin-top: auto !important;
		}
		.mr-md-auto, .mx-md-auto {
			margin-right: auto !important;
		}
		.mb-md-auto, .my-md-auto {
			margin-bottom: auto !important;
		}
		.ml-md-auto, .mx-md-auto {
			margin-left: auto !important;
		}
	}
	
	@media ( min-width : 992px) {
		.m-lg-0 {
			margin: 0 !important;
		}
		.mt-lg-0, .my-lg-0 {
			margin-top: 0 !important;
		}
		.mr-lg-0, .mx-lg-0 {
			margin-right: 0 !important;
		}
		.mb-lg-0, .my-lg-0 {
			margin-bottom: 0 !important;
		}
		.ml-lg-0, .mx-lg-0 {
			margin-left: 0 !important;
		}
		.m-lg-1 {
			margin: 0.25rem !important;
		}
		.mt-lg-1, .my-lg-1 {
			margin-top: 0.25rem !important;
		}
		.mr-lg-1, .mx-lg-1 {
			margin-right: 0.25rem !important;
		}
		.mb-lg-1, .my-lg-1 {
			margin-bottom: 0.25rem !important;
		}
		.ml-lg-1, .mx-lg-1 {
			margin-left: 0.25rem !important;
		}
		.m-lg-2 {
			margin: 0.5rem !important;
		}
		.mt-lg-2, .my-lg-2 {
			margin-top: 0.5rem !important;
		}
		.mr-lg-2, .mx-lg-2 {
			margin-right: 0.5rem !important;
		}
		.mb-lg-2, .my-lg-2 {
			margin-bottom: 0.5rem !important;
		}
		.ml-lg-2, .mx-lg-2 {
			margin-left: 0.5rem !important;
		}
		.m-lg-3 {
			margin: 1rem !important;
		}
		.mt-lg-3, .my-lg-3 {
			margin-top: 1rem !important;
		}
		.mr-lg-3, .mx-lg-3 {
			margin-right: 1rem !important;
		}
		.mb-lg-3, .my-lg-3 {
			margin-bottom: 1rem !important;
		}
		.ml-lg-3, .mx-lg-3 {
			margin-left: 1rem !important;
		}
		.m-lg-4 {
			margin: 1.5rem !important;
		}
		.mt-lg-4, .my-lg-4 {
			margin-top: 1.5rem !important;
		}
		.mr-lg-4, .mx-lg-4 {
			margin-right: 1.5rem !important;
		}
		.mb-lg-4, .my-lg-4 {
			margin-bottom: 1.5rem !important;
		}
		.ml-lg-4, .mx-lg-4 {
			margin-left: 1.5rem !important;
		}
		.m-lg-5 {
			margin: 3rem !important;
		}
		.mt-lg-5, .my-lg-5 {
			margin-top: 3rem !important;
		}
		.mr-lg-5, .mx-lg-5 {
			margin-right: 3rem !important;
		}
		.mb-lg-5, .my-lg-5 {
			margin-bottom: 3rem !important;
		}
		.ml-lg-5, .mx-lg-5 {
			margin-left: 3rem !important;
		}
		.p-lg-0 {
			padding: 0 !important;
		}
		.pt-lg-0, .py-lg-0 {
			padding-top: 0 !important;
		}
		.pr-lg-0, .px-lg-0 {
			padding-right: 0 !important;
		}
		.pb-lg-0, .py-lg-0 {
			padding-bottom: 0 !important;
		}
		.pl-lg-0, .px-lg-0 {
			padding-left: 0 !important;
		}
		.p-lg-1 {
			padding: 0.25rem !important;
		}
		.pt-lg-1, .py-lg-1 {
			padding-top: 0.25rem !important;
		}
		.pr-lg-1, .px-lg-1 {
			padding-right: 0.25rem !important;
		}
		.pb-lg-1, .py-lg-1 {
			padding-bottom: 0.25rem !important;
		}
		.pl-lg-1, .px-lg-1 {
			padding-left: 0.25rem !important;
		}
		.p-lg-2 {
			padding: 0.5rem !important;
		}
		.pt-lg-2, .py-lg-2 {
			padding-top: 0.5rem !important;
		}
		.pr-lg-2, .px-lg-2 {
			padding-right: 0.5rem !important;
		}
		.pb-lg-2, .py-lg-2 {
			padding-bottom: 0.5rem !important;
		}
		.pl-lg-2, .px-lg-2 {
			padding-left: 0.5rem !important;
		}
		.p-lg-3 {
			padding: 1rem !important;
		}
		.pt-lg-3, .py-lg-3 {
			padding-top: 1rem !important;
		}
		.pr-lg-3, .px-lg-3 {
			padding-right: 1rem !important;
		}
		.pb-lg-3, .py-lg-3 {
			padding-bottom: 1rem !important;
		}
		.pl-lg-3, .px-lg-3 {
			padding-left: 1rem !important;
		}
		.p-lg-4 {
			padding: 1.5rem !important;
		}
		.pt-lg-4, .py-lg-4 {
			padding-top: 1.5rem !important;
		}
		.pr-lg-4, .px-lg-4 {
			padding-right: 1.5rem !important;
		}
		.pb-lg-4, .py-lg-4 {
			padding-bottom: 1.5rem !important;
		}
		.pl-lg-4, .px-lg-4 {
			padding-left: 1.5rem !important;
		}
		.p-lg-5 {
			padding: 3rem !important;
		}
		.pt-lg-5, .py-lg-5 {
			padding-top: 3rem !important;
		}
		.pr-lg-5, .px-lg-5 {
			padding-right: 3rem !important;
		}
		.pb-lg-5, .py-lg-5 {
			padding-bottom: 3rem !important;
		}
		.pl-lg-5, .px-lg-5 {
			padding-left: 3rem !important;
		}
		.m-lg-auto {
			margin: auto !important;
		}
		.mt-lg-auto, .my-lg-auto {
			margin-top: auto !important;
		}
		.mr-lg-auto, .mx-lg-auto {
			margin-right: auto !important;
		}
		.mb-lg-auto, .my-lg-auto {
			margin-bottom: auto !important;
		}
		.ml-lg-auto, .mx-lg-auto {
			margin-left: auto !important;
		}
	}
	
	@media ( min-width : 1200px) {
		.m-xl-0 {
			margin: 0 !important;
		}
		.mt-xl-0, .my-xl-0 {
			margin-top: 0 !important;
		}
		.mr-xl-0, .mx-xl-0 {
			margin-right: 0 !important;
		}
		.mb-xl-0, .my-xl-0 {
			margin-bottom: 0 !important;
		}
		.ml-xl-0, .mx-xl-0 {
			margin-left: 0 !important;
		}
		.m-xl-1 {
			margin: 0.25rem !important;
		}
		.mt-xl-1, .my-xl-1 {
			margin-top: 0.25rem !important;
		}
		.mr-xl-1, .mx-xl-1 {
			margin-right: 0.25rem !important;
		}
		.mb-xl-1, .my-xl-1 {
			margin-bottom: 0.25rem !important;
		}
		.ml-xl-1, .mx-xl-1 {
			margin-left: 0.25rem !important;
		}
		.m-xl-2 {
			margin: 0.5rem !important;
		}
		.mt-xl-2, .my-xl-2 {
			margin-top: 0.5rem !important;
		}
		.mr-xl-2, .mx-xl-2 {
			margin-right: 0.5rem !important;
		}
		.mb-xl-2, .my-xl-2 {
			margin-bottom: 0.5rem !important;
		}
		.ml-xl-2, .mx-xl-2 {
			margin-left: 0.5rem !important;
		}
		.m-xl-3 {
			margin: 1rem !important;
		}
		.mt-xl-3, .my-xl-3 {
			margin-top: 1rem !important;
		}
		.mr-xl-3, .mx-xl-3 {
			margin-right: 1rem !important;
		}
		.mb-xl-3, .my-xl-3 {
			margin-bottom: 1rem !important;
		}
		.ml-xl-3, .mx-xl-3 {
			margin-left: 1rem !important;
		}
		.m-xl-4 {
			margin: 1.5rem !important;
		}
		.mt-xl-4, .my-xl-4 {
			margin-top: 1.5rem !important;
		}
		.mr-xl-4, .mx-xl-4 {
			margin-right: 1.5rem !important;
		}
		.mb-xl-4, .my-xl-4 {
			margin-bottom: 1.5rem !important;
		}
		.ml-xl-4, .mx-xl-4 {
			margin-left: 1.5rem !important;
		}
		.m-xl-5 {
			margin: 3rem !important;
		}
		.mt-xl-5, .my-xl-5 {
			margin-top: 3rem !important;
		}
		.mr-xl-5, .mx-xl-5 {
			margin-right: 3rem !important;
		}
		.mb-xl-5, .my-xl-5 {
			margin-bottom: 3rem !important;
		}
		.ml-xl-5, .mx-xl-5 {
			margin-left: 3rem !important;
		}
		.p-xl-0 {
			padding: 0 !important;
		}
		.pt-xl-0, .py-xl-0 {
			padding-top: 0 !important;
		}
		.pr-xl-0, .px-xl-0 {
			padding-right: 0 !important;
		}
		.pb-xl-0, .py-xl-0 {
			padding-bottom: 0 !important;
		}
		.pl-xl-0, .px-xl-0 {
			padding-left: 0 !important;
		}
		.p-xl-1 {
			padding: 0.25rem !important;
		}
		.pt-xl-1, .py-xl-1 {
			padding-top: 0.25rem !important;
		}
		.pr-xl-1, .px-xl-1 {
			padding-right: 0.25rem !important;
		}
		.pb-xl-1, .py-xl-1 {
			padding-bottom: 0.25rem !important;
		}
		.pl-xl-1, .px-xl-1 {
			padding-left: 0.25rem !important;
		}
		.p-xl-2 {
			padding: 0.5rem !important;
		}
		.pt-xl-2, .py-xl-2 {
			padding-top: 0.5rem !important;
		}
		.pr-xl-2, .px-xl-2 {
			padding-right: 0.5rem !important;
		}
		.pb-xl-2, .py-xl-2 {
			padding-bottom: 0.5rem !important;
		}
		.pl-xl-2, .px-xl-2 {
			padding-left: 0.5rem !important;
		}
		.p-xl-3 {
			padding: 1rem !important;
		}
		.pt-xl-3, .py-xl-3 {
			padding-top: 1rem !important;
		}
		.pr-xl-3, .px-xl-3 {
			padding-right: 1rem !important;
		}
		.pb-xl-3, .py-xl-3 {
			padding-bottom: 1rem !important;
		}
		.pl-xl-3, .px-xl-3 {
			padding-left: 1rem !important;
		}
		.p-xl-4 {
			padding: 1.5rem !important;
		}
		.pt-xl-4, .py-xl-4 {
			padding-top: 1.5rem !important;
		}
		.pr-xl-4, .px-xl-4 {
			padding-right: 1.5rem !important;
		}
		.pb-xl-4, .py-xl-4 {
			padding-bottom: 1.5rem !important;
		}
		.pl-xl-4, .px-xl-4 {
			padding-left: 1.5rem !important;
		}
		.p-xl-5 {
			padding: 3rem !important;
		}
		.pt-xl-5, .py-xl-5 {
			padding-top: 3rem !important;
		}
		.pr-xl-5, .px-xl-5 {
			padding-right: 3rem !important;
		}
		.pb-xl-5, .py-xl-5 {
			padding-bottom: 3rem !important;
		}
		.pl-xl-5, .px-xl-5 {
			padding-left: 3rem !important;
		}
		.m-xl-auto {
			margin: auto !important;
		}
		.mt-xl-auto, .my-xl-auto {
			margin-top: auto !important;
		}
		.mr-xl-auto, .mx-xl-auto {
			margin-right: auto !important;
		}
		.mb-xl-auto, .my-xl-auto {
			margin-bottom: auto !important;
		}
		.ml-xl-auto, .mx-xl-auto {
			margin-left: auto !important;
		}
	}
	
	.text-justify {
		text-align: justify !important;
	}
	
	.text-nowrap {
		white-space: nowrap !important;
	}
	
	.text-truncate {
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;
	}
	
	.text-left {
		text-align: left !important;
	}
	
	.text-right {
		text-align: right !important;
	}
	
	.text-center {
		text-align: center !important;
	}
	
	@media ( min-width : 576px) {
		.text-sm-left {
			text-align: left !important;
		}
		.text-sm-right {
			text-align: right !important;
		}
		.text-sm-center {
			text-align: center !important;
		}
	}
	
	@media ( min-width : 768px) {
		.text-md-left {
			text-align: left !important;
		}
		.text-md-right {
			text-align: right !important;
		}
		.text-md-center {
			text-align: center !important;
		}
	}
	
	@media ( min-width : 992px) {
		.text-lg-left {
			text-align: left !important;
		}
		.text-lg-right {
			text-align: right !important;
		}
		.text-lg-center {
			text-align: center !important;
		}
	}
	
	@media ( min-width : 1200px) {
		.text-xl-left {
			text-align: left !important;
		}
		.text-xl-right {
			text-align: right !important;
		}
		.text-xl-center {
			text-align: center !important;
		}
	}
	
	.text-lowercase {
		text-transform: lowercase !important;
	}
	
	.text-uppercase {
		text-transform: uppercase !important;
	}
	
	.text-capitalize {
		text-transform: capitalize !important;
	}
	
	.font-weight-light {
		font-weight: 300 !important;
	}
	
	.font-weight-normal {
		font-weight: 400 !important;
	}
	
	.font-weight-bold {
		font-weight: 700 !important;
	}
	
	.font-italic {
		font-style: italic !important;
	}
	
	.text-white {
		color: #fff !important;
	}
	
	.text-primary {
		color: #ffbc12 !important;
	}
	
	a.text-primary:hover, a.text-primary:focus {
		color: #de9f00 !important;
	}
	
	.text-secondary {
		color: #6c757d !important;
	}
	
	a.text-secondary:hover, a.text-secondary:focus {
		color: #545b62 !important;
	}
	
	.text-success {
		color: #28a745 !important;
	}
	
	a.text-success:hover, a.text-success:focus {
		color: #1e7e34 !important;
	}
	
	.text-info {
		color: #17a2b8 !important;
	}
	
	a.text-info:hover, a.text-info:focus {
		color: #117a8b !important;
	}
	
	.text-warning {
		color: #ffc107 !important;
	}
	
	a.text-warning:hover, a.text-warning:focus {
		color: #d39e00 !important;
	}
	
	.text-danger {
		color: #dc3545 !important;
	}
	
	a.text-danger:hover, a.text-danger:focus {
		color: #bd2130 !important;
	}
	
	.text-light {
		color: #f8f9fa !important;
	}
	
	a.text-light:hover, a.text-light:focus {
		color: #dae0e5 !important;
	}
	
	.text-dark {
		color: #343a40 !important;
	}
	
	a.text-dark:hover, a.text-dark:focus {
		color: #1d2124 !important;
	}
	
	.text-muted {
		color: #6c757d !important;
	}
	
	.text-hide {
		font: 0/0 a;
		color: transparent;
		text-shadow: none;
		background-color: transparent;
		border: 0;
	}
	
	.visible {
		visibility: visible !important;
	}
	
	.invisible {
		visibility: hidden !important;
	}
	
	@media print {
		*, *::before, *::after {
			text-shadow: none !important;
			box-shadow: none !important;
		}
		a:not (.btns ) {
			text-decoration: underline;
		}
		abbr[title]::after {
			content: " (" attr(title) ")";
		}
		pre {
			white-space: pre-wrap !important;
		}
		pre, blockquote {
			border: 1px solid #999;
			page-break-inside: avoid;
		}
		thead {
			display: table-header-group;
		}
		tr, img {
			page-break-inside: avoid;
		}
		p, h2, h3 {
			orphans: 3;
			widows: 3;
		}
		h2, h3 {
			page-break-after: avoid;
		}
		.store-container {
			min-width: 992px !important;
		}
		.badge {
			border: 1px solid #000;
		}
		.table {
			border-collapse: collapse !important;
		}
		.table td, .table th {
			background-color: #fff !important;
		}
		.table-bordered th, .table-bordered td {
			border: 1px solid #ddd !important;
		}
	}
	
	/* main color which will be used for all main block styles... */
	/* 1. Utilities */
	/**
	 * Import component variables
	 */
	/** elements mixins **/
	/**
	* Transition-timing-function property@mixin 
	*/
	/*background RGBA
	============================================*/
	/*inline-block
	============================================*/
	/****/
	/****/
	/****/
	/** elements mixins **/
	/**
	* Transition-timing-function property@mixin 
	*/
	/*background RGBA
	============================================*/
	/*inline-block
	============================================*/
	
	/* 3. Layout */
	/*************************
	         Margin 
	*************************/
	.mt-0 {
		margin-top: 0;
	}
	
	.mt-10 {
		margin-top: 10px;
	}
	
	.mt-12 {
		margin-top: 12px;
	}
	
	.mt-15 {
		margin-top: 15px;
	}
	
	.mt-20 {
		margin-top: 20px;
	}
	
	.mt-30 {
		margin-top: 30px;
	}
	
	.mt-35 {
		margin-top: 35px;
	}
	
	.mt-37 {
		margin-top: 37px;
	}
	
	.mt-40 {
		margin-top: 40px;
	}
	
	.mt-50 {
		margin-top: 50px;
	}
	
	.mt-55 {
		margin-top: 55px;
	}
	
	.mt-60 {
		margin-top: 60px;
	}
	
	.mt-70 {
		margin-top: 70px;
	}
	
	.mt-80 {
		margin-top: 80px;
	}
	
	.mt-90 {
		margin-top: 90px;
	}
	
	.mt-100 {
		margin-top: 100px;
	}
	
	.mt-110 {
		margin-top: 110px;
	}
	
	.mt-120 {
		margin-top: 120px;
	}
	
	.mt-130 {
		margin-top: 130px;
	}
	
	.mt-140 {
		margin-top: 140px;
	}
	
	.mt-160 {
		margin-top: 160px;
	}
	
	.mt-179 {
		margin-top: 179px;
	}
	
	.mt-150 {
		margin-top: 150px;
	}
	
	/*************************
	      Margin right
	*************************/
	.mr-0 {
		margin-right: 0px;
	}
	
	.mr-10 {
		margin-right: 10px;
	}
	
	.mr-12 {
		margin-right: 12px;
	}
	
	.mr-15 {
		margin-right: 15px;
	}
	
	.mr-20 {
		margin-right: 20px;
	}
	
	.mr-30 {
		margin-right: 30px;
	}
	
	.mr-35 {
		margin-right: 35px;
	}
	
	.mr-40 {
		margin-right: 40px;
	}
	
	.mr-50 {
		margin-right: 50px;
	}
	
	.mr-60 {
		margin-right: 60px;
	}
	
	.mr-70 {
		margin-right: 70px;
	}
	
	.mr-80 {
		margin-right: 80px;
	}
	
	.mr-90 {
		margin-right: 90px;
	}
	
	.mr-100 {
		margin-right: 100px;
	}
	
	.mr-110 {
		margin-right: 110px;
	}
	
	.mr-120 {
		margin-right: 120px;
	}
	
	.mr-130 {
		margin-right: 130px;
	}
	
	.mr-140 {
		margin-right: 140px;
	}
	
	.mr-150 {
		margin-right: 150px;
	}
	
	/*************************
	      Margin bottom
	*************************/
	.mb-0 {
		margin-bottom: 0;
	}
	
	.mb-10 {
		margin-bottom: 10px;
	}
	
	.mb-12 {
		margin-bottom: 12px;
	}
	
	.mb-15 {
		margin-bottom: 15px;
	}
	
	.mb-20 {
		margin-bottom: 20px;
	}
	
	.mb-25 {
		margin-bottom: 25px;
	}
	
	.mb-30 {
		margin-bottom: 30px;
	}
	
	.mb-35 {
		margin-bottom: 35px;
	}
	
	.mb-40 {
		margin-bottom: 40px;
	}
	
	.mb-45 {
		margin-bottom: 45px;
	}
	
	.mb-50 {
		margin-bottom: 50px;
	}
	
	.mb-55 {
		margin-bottom: 55px;
	}
	
	.mb-60 {
		margin-bottom: 60px;
	}
	
	.mb-65 {
		margin-bottom: 65px;
	}
	
	.mb-70 {
		margin-bottom: 70px;
	}
	
	.mb-80 {
		margin-bottom: 80px;
	}
	
	.mb-90 {
		margin-bottom: 90px;
	}
	
	.mb-100 {
		margin-bottom: 100px;
	}
	
	.mb-110 {
		margin-bottom: 110px;
	}
	
	.mb-120 {
		margin-bottom: 120px;
	}
	
	.mb-130 {
		margin-bottom: 130px;
	}
	
	.mb-140 {
		margin-bottom: 140px;
	}
	
	.mb-150 {
		margin-bottom: 150px;
	}
	
	/*************************
	        Margin left
	*************************/
	.ml-0 {
		margin-left: 0;
	}
	
	.ml-10 {
		margin-left: 10px;
	}
	
	.ml-12 {
		margin-left: 12px;
	}
	
	.ml-15 {
		margin-left: 15px;
	}
	
	.ml-20 {
		margin-left: 20px;
	}
	
	.ml-30 {
		margin-left: 30px;
	}
	
	.ml-40 {
		margin-left: 40px;
	}
	
	.ml-50 {
		margin-left: 50px;
	}
	
	.ml-60 {
		margin-left: 60px;
	}
	
	.ml-70 {
		margin-left: 70px;
	}
	
	.ml-80 {
		margin-left: 80px;
	}
	
	.ml-90 {
		margin-left: 90px;
	}
	
	.ml-100 {
		margin-left: 100px;
	}
	
	.ml-110 {
		margin-left: 110px;
	}
	
	.ml-120 {
		margin-left: 120px;
	}
	
	.ml-125 {
		margin-left: 125px;
	}
	
	.ml-130 {
		margin-left: 130px;
	}
	
	.ml-140 {
		margin-left: 140px;
	}
	
	.ml-150 {
		margin-left: 150px;
	}
	
	/*************************
	        Padding top
	*************************/
	.pt-0 {
		padding-top: 0;
	}
	
	.pt-10 {
		padding-top: 10px;
	}
	
	.pt-15 {
		padding-top: 15px;
	}
	
	.pt-20 {
		padding-top: 20px;
	}
	
	.pt-30 {
		padding-top: 30px;
	}
	
	.pt-37 {
		padding-top: 37px;
	}
	
	.pt-40 {
		padding-top: 40px;
	}
	
	.pt-50 {
		padding-top: 50px;
	}
	
	.pt-55 {
		padding-top: 55px;
	}
	
	.pt-60 {
		padding-top: 60px;
	}
	
	.pt-65 {
		padding-top: 65px;
	}
	
	.pt-70 {
		padding-top: 70px;
	}
	
	.pt-75 {
		padding-top: 75px;
	}
	
	.pt-80 {
		padding-top: 80px;
	}
	
	.pt-85 {
		padding-top: 85px;
	}
	
	.pt-95 {
		padding-top: 95px;
	}
	
	.pt-90 {
		padding-top: 90px;
	}
	
	.pt-100 {
		padding-top: 100px;
	}
	
	.pt-105 {
		padding-top: 105px;
	}
	
	.pt-110 {
		padding-top: 110px;
	}
	
	.pt-115 {
		padding-top: 115px;
	}
	
	.pt-120 {
		padding-top: 120px;
	}
	
	.pt-125 {
		padding-top: 125px;
	}
	
	.pt-130 {
		padding-top: 130px;
	}
	
	.pt-135 {
		padding-top: 135px;
	}
	
	.pt-140 {
		padding-top: 140px;
	}
	
	.pt-150 {
		padding-top: 150px;
	}
	
	.pt-160 {
		padding-top: 160px;
	}
	
	.pt-180 {
		padding-top: 180px;
	}
	
	.pt-200 {
		padding-top: 200px;
	}
	
	.pt-300 {
		padding-top: 300px;
	}
	
	/*************************
	        Padding right
	*************************/
	.pr-0 {
		padding-right: 0;
	}
	
	.pr-10 {
		padding-right: 10px;
	}
	
	.pr-15 {
		padding-right: 15px;
	}
	
	.pr-20 {
		padding-right: 20px;
	}
	
	.pr-30 {
		padding-right: 30px;
	}
	
	.pr-40 {
		padding-right: 40px;
	}
	
	.pr-50 {
		padding-right: 50px;
	}
	
	.pr-60 {
		padding-right: 60px;
	}
	
	.pr-70 {
		padding-right: 70px;
	}
	
	.pr-80 {
		padding-right: 80px;
	}
	
	.pr-90 {
		padding-right: 90px;
	}
	
	.pr-100 {
		padding-right: 100px;
	}
	
	.pr-110 {
		padding-right: 110px;
	}
	
	.pr-120 {
		padding-right: 120px;
	}
	
	.pr-130 {
		padding-right: 130px;
	}
	
	.pr-140 {
		padding-right: 140px;
	}
	
	.pr-150 {
		padding-right: 150px;
	}
	
	.pr-160 {
		padding-right: 160px;
	}
	
	.pr-180 {
		padding-right: 180px;
	}
	
	.pr-195 {
		padding-right: 195px;
	}
	
	/*************************
	        Padding bottom
	*************************/
	.pb-0 {
		padding-bottom: 0;
	}
	
	.pb-10 {
		padding-bottom: 10px;
	}
	
	.pb-15 {
		padding-bottom: 15px;
	}
	
	.pb-20 {
		padding-bottom: 20px;
	}
	
	.pb-25 {
		padding-bottom: 25px;
	}
	
	.pb-30 {
		padding-bottom: 30px;
	}
	
	.pb-35 {
		padding-bottom: 35px;
	}
	
	.pb-40 {
		padding-bottom: 40px;
	}
	
	.pb-45 {
		padding-bottom: 45px;
	}
	
	.pb-50 {
		padding-bottom: 50px;
	}
	
	.pb-55 {
		padding-bottom: 55px;
	}
	
	.pb-60 {
		padding-bottom: 60px;
	}
	
	.pb-65 {
		padding-bottom: 65px;
	}
	
	.pb-70 {
		padding-bottom: 70px;
	}
	
	.pb-75 {
		padding-bottom: 75px;
	}
	
	.pb-80 {
		padding-bottom: 80px;
	}
	
	.pb-85 {
		padding-bottom: 85px;
	}
	
	.pb-90 {
		padding-bottom: 90px;
	}
	
	.pb-95 {
		padding-bottom: 95px;
	}
	
	.pb-97 {
		padding-bottom: 97px;
	}
	
	.pb-100 {
		padding-bottom: 100px;
	}
	
	.pb-110 {
		padding-bottom: 110px;
	}
	
	.pb-115 {
		padding-bottom: 115px;
	}
	
	.pb-120 {
		padding-bottom: 120px;
	}
	
	.pb-125 {
		padding-bottom: 125px;
	}
	
	.pb-130 {
		padding-bottom: 130px;
	}
	
	.pb-140 {
		padding-bottom: 140px;
	}
	
	.pb-145 {
		padding-bottom: 145px;
	}
	
	.pb-150 {
		padding-bottom: 150px;
	}
	
	.pb-160 {
		padding-bottom: 160px;
	}
	
	.pb-180 {
		padding-bottom: 180px;
	}
	
	.pb-200 {
		padding-bottom: 200px;
	}
	
	.pb-250 {
		padding-bottom: 250px;
	}
	
	.pb-300 {
		padding-bottom: 300px;
	}
	
	/*************************
	        Padding left
	*************************/
	.pl-0 {
		padding-left: 0;
	}
	
	.pl-5 {
		padding-left: 5px;
	}
	
	.pl-10 {
		padding-left: 10px;
	}
	
	.pl-15 {
		padding-left: 15px;
	}
	
	.pl-20 {
		padding-left: 20px;
	}
	
	.pl-30 {
		padding-left: 30px;
	}
	
	.pl-40 {
		padding-left: 40px;
	}
	
	.pl-50 {
		padding-left: 50px;
	}
	
	.pl-60 {
		padding-left: 60px;
	}
	
	.pl-70 {
		padding-left: 70px;
	}
	
	.pl-80 {
		padding-left: 80px;
	}
	
	.pl-90 {
		padding-left: 90px;
	}
	
	.pl-100 {
		padding-left: 100px;
	}
	
	.pl-110 {
		padding-left: 110px;
	}
	
	.pl-120 {
		padding-left: 120px;
	}
	
	.pl-125 {
		padding-left: 125px;
	}
	
	.pl-130 {
		padding-left: 130px;
	}
	
	.pl-140 {
		padding-left: 140px;
	}
	
	.pl-150 {
		padding-left: 150px;
	}
	
	.pl-155 {
		padding-left: 155px;
	}
	
	.pl-190 {
		padding-left: 190px;
	}
	
	.pl-195 {
		padding-left: 195px;
	}
	
	/***************************
	    Page section padding 
	****************************/
	.ptb-0 {
		padding: 0;
	}
	
	.ptb-10 {
		padding: 10px 0;
	}
	
	.ptb-15 {
		padding: 15px 0;
	}
	
	.ptb-20 {
		padding: 20px 0;
	}
	
	.ptb-30 {
		padding: 30px 0;
	}
	
	.ptb-32 {
		padding: 32px 0;
	}
	
	.ptb-40 {
		padding: 40px 0;
	}
	
	.ptb-50 {
		padding: 50px 0;
	}
	
	.ptb-60 {
		padding: 60px 0;
	}
	
	.ptb-70 {
		padding: 70px 0;
	}
	
	.ptb-80 {
		padding: 80px 0;
	}
	
	.ptb-90 {
		padding: 90px 0;
	}
	
	.ptb-100 {
		padding: 100px 0;
	}
	
	.ptb-110 {
		padding: 110px 0;
	}
	
	.ptb-120 {
		padding: 120px 0;
	}
	
	.ptb-130 {
		padding: 130px 0;
	}
	
	.ptb-135 {
		padding: 135px 0;
	}
	
	.ptb-140 {
		padding: 140px 0;
	}
	
	.ptb-150 {
		padding: 150px 0;
	}
	
	.ptb-160 {
		padding: 160px 0;
	}
	
	.ptb-170 {
		padding: 170px 0;
	}
	
	.ptb-177 {
		padding: 177px 0;
	}
	
	.ptb-180 {
		padding: 180px 0;
	}
	
	.ptb-190 {
		padding: 190px 0;
	}
	
	.ptb-200 {
		padding: 200px 0;
	}
	
	.ptb-210 {
		padding: 210px 0;
	}
	
	.ptb-220 {
		padding: 220px 0;
	}
	
	.ptb-250 {
		padding: 250px 0;
	}
	
	.ptb-290 {
		padding: 290px 0;
	}
	
	.ptb-310 {
		padding: 310px 0;
	}
	
	/***************************
	    Page section margin 
	****************************/
	.mtb-0 {
		margin: 0;
	}
	
	.mtb-10 {
		margin: 10px 0;
	}
	
	.mtb-15 {
		margin: 15px 0;
	}
	
	.mtb-20 {
		margin: 20px 0;
	}
	
	.mtb-30 {
		margin: 30px 0;
	}
	
	.mtb-40 {
		margin: 40px 0;
	}
	
	.mtb-50 {
		margin: 50px 0;
	}
	
	.mtb-60 {
		margin: 60px 0;
	}
	
	.mtb-70 {
		margin: 70px 0;
	}
	
	.mtb-80 {
		margin: 80px 0;
	}
	
	.mtb-90 {
		margin: 90px 0;
	}
	
	.mtb-100 {
		margin: 100px 0;
	}
	
	.mtb-110 {
		margin: 110px 0;
	}
	
	.mtb-120 {
		margin: 120px 0;
	}
	
	.mtb-130 {
		margin: 130px 0;
	}
	
	.mtb-140 {
		margin: 140px 0;
	}
	
	.mtb-150 {
		margin: 150px 0;
	}
	
	.mtb-290 {
		margin: 290px 0;
	}
	
	.text-capitalize {
		text-transform: capitalize;
	}
	
	.text-uppercase {
		text-transform: uppercase;
	}
	
	.text-lowercase {
		text-transform: lowercase;
	}
	
	.text-center {
		text-align: center;
	}
	
	.text-white {
		color: #fff !important;
	}
	
	.color-primary {
		color: #8AB839 !important;
	}
	
	/*-----------------------------
	     display
	 -------------------------------*/
	.otf-flex-item {
		flex: 1 0 auto;
	}
	
	.required {
		color: red;
	}
	
	select, textarea {
		width: 100%;
		padding: 12px 20px;
		border: solid 1px #e1e1e1;
		border-radius: 3px;
	}
	
	select:focus {
		outline: 0;
		box-shadow: none;
		border: solid 1px #e1e1e1;
	}
	
	input.btns {
		width: auto;
	}
	
	.first {
		clear: both;
	}
	
	.font-italic {
		font-style: italic;
	}
	
	.font-bold {
		font-weight: bold !important;
	}
	
	.item {
		outline: none;
	}
	
	/*---------------------------
	    page-404
	-----------------------------*/
	.page-404 .title_404 {
		font-size: 100px;
		font-weight: 500;
		letter-spacing: -1px;
	}
	
	.page-404 .error-description {
		font-size: 16px;
		color: #1e2024;
	}
	
	.page-404 .back-home {
		text-transform: uppercase;
		border-radius: 30px;
	}
	
	@media only screen and (max-width: 768px) {
		.page-404 {
			text-align: center;
		}
		.page-404 .title_404 {
			font-size: 50px;
		}
		.page-404 img {
			padding-top: 30px;
		}
	}
	
	/* 5. Widget */
	/*-----------------------------
	 sidebar
	 -------------------------------*/
	.widget-title {
		font-size: 16px;
		font-weight: bold;
		text-transform: uppercase;
	}
	
	.widget-title__large {
		padding: 14px 20px;
	}
	
	@media ( min-width : 1200px) {
		.widget-title__large {
			font-size: 18px;
		}
	}
	
	.sidebar .widget {
		display: inline-block;
		width: 100%;
		margin: 0;
	}
	
	.sidebar .widget:not (:last-child ) {
		margin-bottom: 60px;
	}
	
	@media ( max-width : 1199.98px) {
		.sidebar .widget {
			font-size: 14px;
		}
	}
	
	.sidebar ul {
		margin: 0px;
		padding: 0px;
	}
	
	.sidebar ul li {
		list-style: none;
	}
	
	/*-----------------------------
	   pagination
	 -------------------------------*/
	.pagination {
		display: block;
	}
	
	.pagination ul.page-numbers {
		padding-top: 30px;
		padding-left: 300px;
		margin-bottom: 100px;
	}
	
	.pagination ul.page-numbers li {
		display: inline-block;
	}
	
	@media ( max-width : 1199px) {
		.pagination ul.page-numbers {
			padding-top: 30px;
			padding-left: 210px;
			margin-bottom: 100px;
		}
	}
	
	@media ( max-width : 991px) {
		.pagination ul.page-numbers {
			padding-top: 30px;
			padding-left: 100px;
			margin-bottom: 100px;
		}
	}
	
	@media ( max-width : 767px) {
		.pagination ul.page-numbers {
			padding-top: 30px;
			padding-left: 130px;
			margin-bottom: 100px;
		}
	}
	
	@media ( max-width : 500px) {
		.pagination ul.page-numbers {
			padding-top: 30px;
			padding-left: 110px;
			margin-bottom: 100px;
		}
	}
	
	.pagination .page-numbers:not(ul) {
		display: block;
		text-align: center;
		width: 40px;
		height: 32px;
		line-height: 32px;
		border: 1px solid #e1e1e1;
		border-radius: 3px;
		-webkit-border-radius: 3px;
		-moz-border-radius: 3px;
		-ms-border-radius: 3px;
		-o-border-radius: 3px;
	}
	
	.pagination .page-numbers:not(ul).curren, .pagination .page-numbers:not(ul):hover
		{
		background: #8AB839;
		color: #fff;
	}
	
	.pagination .current {
		background: #8AB839;
		color: #fff;
	}
	
	/* 6. Widget product */
	/*-----------------------------
	  filter product
	 -------------------------------*/
	a:hover {
		color: #8AB839;
	}
	
	.widget-categories-cat .widget-title {
		background: #1e2024;
		color: #fff;
		margin: 0;
	}
	
	.widget-categories-cat ul {
		border: solid 1px #e1e1e1;
		border-top: none;
	}
	
	.widget-categories-cat ul li {
		padding: 13px 20px;
	}
	
	.widget-categories-cat ul li a {
		position: relative;
	}
	
	.widget-categories-cat ul li a:after {
		content: '\f105';
		font-family: FontAwesome;
		float: right;
		color: #9a9da2;
		display: inline-block;
	}
	
	.widget-categories-cat ul li:not (:last-child ) {
		border-bottom: solid 1px #e1e1e1;
	}
	
	.widget_filter .ps-slider {
		display: block;
		margin-bottom: 30px;
		height: 3px;
		background-color: #cecece;
		position: relative;
		border-radius: 0;
		border: none;
	}
	
	.widget_filter .ui-slider-range {
		position: absolute;
		top: 0;
		left: 0;
		height: 100%;
		background-color: #8AB839;
		border-radius: 0;
		border: none;
	}
	
	.widget_filter .ui-slider-handle {
		display: inline-block;
		top: 50%;
		height: 18px;
		width: 18px;
		outline: none;
		cursor: pointer;
		background-color: #8AB839;
		border: none;
		border-radius: 50%;
	}
	
	.widget_filter .ps-slider__meta span {
		color: #8AB839;
		margin-left: 5px;
		margin-right: 5px;
	}
	
	.widget_filter .ps-filter__btns {
		background-color: #888;
		color: #fff;
	}
	
	.widget_filter .ps-filter__btns:hover {
		background-color: #8AB839;
	}
	
	.widget_filter .ui-slider .ui-slider-handle {
		position: absolute;
		z-index: 2;
		cursor: default;
		-ms-touch-action: none;
		touch-action: none;
		margin-top: -8px;
		margin-left: -.6em;
	}
	
	.list-checked li {
		margin-bottom: 10px;
	}
	
	.list-checked li a {
		position: relative;
		display: block;
		padding-left: 30px;
	}
	
	.list-checked li a:before {
		display: inline-block;
		position: absolute;
		top: 3px;
		left: 0;
		content: '';
		width: 15px;
		height: 15px;
		background-color: #e0e2e6;
		border-color: #e0e2e6;
		border-radius: 2px;
		-webkit-transition: all 0.4s ease;
		-moz-transition: all 0.4s ease;
		transition: all 0.4s ease;
	}
	
	.list-checked li a:after {
		content: '';
		display: inline-block;
		position: absolute;
		top: 5px;
		left: 6px;
		color: #8AB839;
		width: 6px;
		height: 12px;
		border-right: 3px solid #8AB839;
		border-bottom: 4px solid #8AB839;
		-webkit-transform: rotate(45deg);
		-moz-transform: rotate(45deg);
		-ms-transform: rotate(45deg);
		-o-transform: rotate(45deg);
		transform: rotate(45deg);
		visibility: hidden;
		opacity: 0;
	}
	
	.list-checked li.current a:after {
		visibility: visible;
		opacity: 1;
	}
	
	.widget-woof .widget {
		margin: 0 !important;
		padding: 14px 20px;
	}
	
	.widget-woof .widget-content {
		padding-top: 20px;
	}
	
	.widget-woof .widget-title__large {
		position: relative;
		color: #fff;
		background-color: #000;
		margin-bottom: 0;
	}
	
	.widget-woof .widget-woof-content {
		border: solid 1px #e1e1e1;
	}
	
	.widget-woof .widget-woof-content>.widget:not (:last-child ) {
		border-bottom: solid 1px #e1e1e1;
	}
	
	.widget_collapse {
		position: relative;
		cursor: pointer;
		margin: 0;
	}
	
	.widget_collapse:after {
		font-size: 18px;
		content: "\f107";
		font-family: "FontAwesome";
		position: absolute;
		color: #000;
		right: 18px;
	}
	
	/* Restyle Checkbox */
	.login100-form {
		width: 100%;
	}
	
	.contact100-form-checkbox {
		padding-left: 5px;
		padding-top: 5px;
		padding-bottom: 5px;
	}
	
	.input-checkbox100 {
		display: none;
	}
	
	.label-checkbox100 {
		font-family: "Open Sans", sans-serif;
		font-size: 16px;
		color: #545454;
		line-height: 1.2;
		display: block;
		position: relative;
		padding-left: 30px;
		cursor: pointer;
	}
	
	.label-checkbox100::before {
		content: "\f26b";
		font-family: Material-Design-Iconic-Font;
		font-size: 13px;
		color: transparent;
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-box;
		display: -ms-flexbox;
		display: flex;
		justify-content: center;
		align-items: center;
		position: absolute;
		width: 14px;
		height: 14px;
		border-radius: 2px;
		border: 1px solid #7e7e7e;
		background: #fff;
		left: 0;
		top: 50%;
		margin-right: 50px;
		-webkit-transform: translateY(-50%);
		-moz-transform: translateY(-50%);
		-ms-transform: translateY(-50%);
		-o-transform: translateY(-50%);
		transform: translateY(-50%);
	}
	
	.input-checkbox100:checked+.label-checkbox100::before {
		color: #545454;
	}
	
	/* 9. Post single */
	.blockquote {
		border-left: 3px solid #8AB839;
		padding: 20px 30px;
	}
	
	.theme-heading {
		font-size: 24px;
		padding: 15px 0;
	}
	
	.entry-meta {
		text-transform: uppercase;
	}
	
	.entry-meta a {
		padding: 0px 2px;
		color: #8AB839;
	}
	
	.post-date, .entry-author {
		font-size: 9px;
		font-weight: 500;
		text-transform: uppercase;
	}
	
	.comments-link a {
		font-size: 12px;
		font-weight: 500;
		color: #9a9da2;
	}
	
	.comments-link a i {
		color: #8AB839;
		padding-right: 5px;
	}
	
	.post-title {
		font-size: 16px;
		color: #1e2024;
	}
	
	/* 10. Post product */
	ul.columns {
		display: block;
		margin: 0;
		padding: 0;
		text-align: center;
	}
	
	ul.columns li {
		flex: 1;
		max-width: 100%;
		display: inline-block;
		padding: 15px;
	}
	
	@media ( max-width : 767.98px) {
		ul.columns li {
			margin-bottom: 30px;
			border: solid 1px #e1e1e1;
		}
	}
	
	@media only screen and (min-width: 480px) {
		ul.columns {
			display: flex;
			flex-wrap: wrap;
			border-top: solid 1px #e1e1e1;
		}
		ul.columns li {
			border: solid 1px #e1e1e1;
			border-left: none;
			border-top: none;
		}
		ul.columns .product-block {
			margin-bottom: 10px;
		}
		ul.columns-4 li {
			flex: 0 0 25%;
			max-width: 25%;
		}
		ul.columns-4 li:nth-child(4n+1) {
			border-left: solid 1px #e1e1e1;
		}
		ul.columns-5 li {
			flex: 0 0 20%;
			max-width: 20%;
		}
		ul.columns-5 li:nth-child(5n+1) {
			border-left: solid 1px #e1e1e1;
		}
		ul.columns-6 li {
			flex: 0 0 calc(100%/ 6);
			max-width: calc(100%/ 6);
		}
		ul.columns-6 li:nth-child(6n+1) {
			border-left: solid 1px #e1e1e1;
		}
	}
	
	@media ( min-width : 769px) and (max-width: 1200px) {
		ul.columns-6 li {
			flex: 0 0 calc(100%/ 3);
			max-width: calc(100%/ 3);
		}
		ul.columns-6 li:nth-child(3n+1) {
			border-left: solid 1px #e1e1e1;
		}
	}
	
	@media ( min-width : 480px) and (max-width: 768px) {
		ul.columns li {
			flex: 0 0 calc(100%/ 2);
			max-width: calc(100%/ 2);
		}
		ul.columns li:nth-child(2n+1) {
			border-left: solid 1px #e1e1e1;
		}
	}
	
	.product-list {
		padding: 0px;
	}
	
	.product-list .product-list__item .inner {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		padding: 10px 0;
	}
	
	.product-list .product-list__item .inner .product-title {
		font-size: 1rem;
		line-height: 20px;
		margin-bottom: 20px;
	}
	
	.product-list .product-list__item .inner .product-thumbnail {
		width: 100px;
		height: 120px;
		margin-right: 20px;
		overflow: hidden;
	}
	
	@media ( max-width : 991.98px) {
		.product-list .product-list__item .inner .product-thumbnail img {
			filter: brightness(90%);
		}
	}
	
	.product-list .product-list__item:hover .product-title a {
		color: #8AB839;
	}
	
	.products_list {
		padding: 30px 0;
	}
	
	.product-block-list-carousel {
		margin-bottom: 30px;
	}
	
	.product-block-list-carousel .slick-slider .slick-arrow {
		top: -30px;
		cursor: pointer;
		opacity: 1;
		z-index: 999;
		font-size: 18px;
		color: #9a9da2;
	}
	
	.product-block-list-carousel .slick-slider .slick-prev {
		right: 40px;
		left: unset;
	}
	
	.product-block-list-carousel .slick-slider .slick-prev:before {
		content: "\f190";
	}
	
	.product-block-list-carousel .slick-slider .slick-next {
		right: 20px;
	}
	
	.product-block-list-carousel .slick-slider .slick-next:before {
		content: "\f18e";
	}
	
	.product-list-siderbar {
		border: solid 1px #e1e1e1;
	}
	
	.product-list-siderbar li {
		list-style: none;
		margin: 0 15px;
	}
	
	.product-list-siderbar li .inner {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		padding: 15px 0;
	}
	
	.product-list-siderbar li .inner .product-title {
		font-size: 0.85rem;
		font-weight: normal;
		line-height: 20px;
	}
	
	.product-list-siderbar li .inner .product-thumbnail {
		width: 80px;
		height: 100px;
		margin-right: 20px;
		overflow: hidden;
	}
	
	.product-list-siderbar li:not (:last-child ) .inner {
		border-bottom: solid 1px #e1e1e1;
	}
	
	.product-list-siderbar li:hover .product-title a {
		color: #8AB839;
	}
	
	/*-----------------------------
	  product-block
	 -------------------------------*/
	.product-thumbnail {
		text-align: center;
	}
	
	.product-price ins {
		font-size: 16px;
		font-weight: 600;
		color: #8AB839;
		text-decoration: none;
	}
	
	.product-price del {
		font-size: 12px;
		font-weight: 500;
		text-decoration: line-through;
		padding-left: 6px;
		color: #9a9da2;
	}
	
	.product-form-cart {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding-top: 10px;
	}
	
	.product-form-cart .add_to_cart_button {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		align-items: center;
		justify-content: center;
		width: 44px;
		height: 44px;
		background: #a5a9af;
		border-radius: 50%;
		-webkit-border-radius: 50%;
		-moz-border-radius: 50%;
		-ms-border-radius: 50%;
		-o-border-radius: 50%;
		color: #fff;
	}
	
	.product-caption {
		padding-top: 15px;
	}
	
	.posted_in a {
		font-size: 12px;
		font-weight: 500;
	}
	
	.product-title {
		font-size: 16px;
		margin: 4px 0px;
	}
	
	.product-block {
		position: relative;
		margin-bottom: 60px;
	}
	
	.add_to_cart_button:hover {
		background: #8AB839;
	}
	
	@media ( max-width : 767.98px) {
		.products-grid .product-block {
			padding: 15px;
			border: solid 1px #e1e1e1;
		}
	}
	
	@media ( min-width : 576px) {
		.products-grid .product-block .product-image {
			border: solid 1px #e1e1e1;
		}
	}
	
	.product-block-list {
		margin-bottom: 60px;
	}
	
	.product-block-list figure {
		margin: 0;
	}
	
	@media ( max-width : 991.98px) {
		.product-block-list figure {
			border: solid 1px #e1e1e1;
		}
	}
	
	.product-block-list .product-meta {
		display: flex;
		justify-content: space-between;
		align-items: center;
	}
	
	.product-block-list .excerpt {
		padding-top: 20px;
	}
	
	.add_to_cart_button {
		background: #8AB839;
	}
	
	.product-footer {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		align-items: center;
		padding-top: 30px;
	}
	
	.product-footer form.add-to-cart {
		display: flex;
	}
	
	.product-footer button {
		margin-top: 0px;
		margin-right: 6px;
	}
	
	.product-footer .product-actions {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
	}
	
	.product-footer .btns {
		background-color: #545454;
		color: #fff;
		height: 55px;
		margin-right: 5px;
	}
	
	.product-footer .btns:hover {
		background: #8AB839;
		color: #fff;
	}
	
	.product-footer .add_to_cart_button {
		padding: 16px 25px;
		text-transform: uppercase;
		border-radius: 30px;
	}
	
	.product-footer .add_to_cart_button i {
		padding-right: 7px;
	}
	
	.star-rating {
		color: #ffbc12;
	}
	
	/*-----------------------------
	  grid-list-view
	 -------------------------------*/
	.product-shorting {
		background: #1e2024;
		color: #fff;
		margin-bottom: 30px;
		padding: 13px 20px;
		font-size: 12px;
	}
	
	@media ( max-width : 767.98px) {
		.product-shorting {
			display: block !important;
		}
		.product-shorting>div {
			padding-bottom: 10px;
		}
	}
	
	.product-shorting .grid-list-view {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		align-items: center;
	}
	
	.product-shorting .grid-list-view ul.nav {
		display: -webkit-box;
		display: -webkit-flex;
		display: -moz-flex;
		display: -ms-flexbox;
		display: flex;
		align-items: center;
		font-size: 14px;
	}
	
	.product-shorting .grid-list-view ul.nav li a {
		margin-right: 10px;
		padding: 0px;
		color: #686b6f;
	}
	
	.product-shorting .grid-list-view ul.nav li a:hover {
		border-color: transparent;
	}
	
	.product-shorting .grid-list-view ul.nav li a.active {
		background: transparent;
		border: none;
		color: #fff;
	}
	
	.product-shorting .grid-list-view ul.nav li:last-child a {
		margin-right: 0px;
	}
	
	.product-shorting select {
		background: #282b31;
		border-color: #282b31;
		margin-left: 5px;
		padding: 10px;
		width: auto;
	}
	
	.product-shorting span {
		font-weight: 600;
		text-transform: uppercase;
	}
	
	.toolbar-sorter {
		display: flex;
		align-items: center;
	}
	
	.toolbar-sorter select {
		color: #e1e1e1;
	}
	
	/* :: 4.0 Header ?òÅ?ó≠ CSS */
	.toolbar-sorter .top-search-area {
		position: relative;
		z-index: 1;
	}
	
	.toolbar-sorter .top-search-area form {
		position: relative;
		z-index: 1;
		width: 320px;
	}
	
	@media only screen and (max-width: 767px) {
		.toolbar-sorter .top-search-area form {
			width: 320px;
		}
		.toolbar-sorter .top-search-area form button {
			position: relative;
			top: 0;
			right: 0;
			z-index: 10;
			background-color: transparent;
			border: none;
			color: #555555;
			cursor: pointer;
		}
	}
	
	@media only screen and (min-width: 480px) and (max-width: 767px) {
		.toolbar-sorter .top-search-area form {
			width: 320px;
		}
		.toolbar-sorter .top-search-area form button {
			position: relative;
			top: 0;
			right: 0;
			z-index: 10;
			background-color: transparent;
			border: none;
			color: #555555;
			cursor: pointer;
		}
	}
	
	@media only screen and (min-width: 576px) and (max-width: 767px) {
		.toolbar-sorter .top-search-area form {
			width: 320px;
		}
		.toolbar-sorter .top-search-area form button {
			position: relative;
			top: 0;
			right: 0;
			z-index: 10;
			background-color: transparent;
			border: none;
			color: #555555;
			cursor: pointer;
		}
	}
	
	.toolbar-sorter .top-search-area form input {
		margin-left: 10px;
		-webkit-transition-duration: 500ms;
		transition-duration: 500ms;
		position: relative;
		z-index: 1;
		width: 320px;
		height: 30px;
		background-color: #ebf5f5;
		border: none;
		color: #545454;
		font-size: 12px;
		font-style: italic;
		padding: 0 10px;
		outline-color: #8ab839;
	}
	
	.toolbar-sorter .top-search-area form input:focus {
		box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.15);
	}
	
	.toolbar-sorter .top-search-area form button {
		position: absolute;
		top: 0;
		right: 0;
		z-index: 10;
		background-color: transparent;
		border: none;
		color: #555555;
		cursor: pointer;
	}
	
	.toolbar-sorter .top-search-area form button:hover, .toolbar-sorter .top-search-area form button:focus
		{
		color: #8ab839;
		box-shadow: none;
	}
	
	.may_also {
		font-size: 13px;
	}
	
	.may_also .may_also__title {
		font-size: 24px;
		font-weight: normal;
		margin: 2px 0;
	}
	
	.archive-product .pagination {
		text-align: center;
	}
	
	/* 11. Responsive */
	@media only screen and (min-width: 1230px) {
		.layout-boxed {
			width: 1230px;
			margin: 60px auto 0;
		}
	}
	
	@media only screen and (max-width: 992px) {
		.product-info .product-meta {
			padding-top: 20px;
		}
	}
	
	@media only screen and (max-width: 767px) {
		.blog .blog-list article {
			display: block;
		}
		.sidebar {
			padding-top: 60px;
		}
	}
}

