<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><input type="text" name="description" id="description"></td>
            </tr>
            <tr>
                <td>Manufacturer: </td>
                <td><input type="text" name="manufacturer" id="manufacturer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<p>--%>
<%--    <a href="/product">Back to product list</a>--%>
<%--</p>--%>
<%--<div class="container-fluid">--%>
<%--    <div class="row">--%>
<%--        <div class="col-3">--%>
<%--        </div>--%>
<%--        <div class="col-9">--%>
<%--            <form method="post" class="needs-validation" novalidate>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="id">Id</label>--%>
<%--                    <input type="text" class="form-control" id="id" name="id" required  pattern="(\d{3})">--%>
<%--                    <div class="valid-feedback">hợp lệ</div>--%>
<%--                    <div class="invalid-feedback">Vui lòng nhập voi dinh dang Id < 1000</div>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="name-product">Name Product</label>--%>
<%--                    <input type="text" class="form-control" id="name-product" name="name-product">--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="price">Price</label>--%>
<%--                    <input type="text" class="form-control" id="price" name="price">--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="description">Description</label>--%>
<%--                    <input type="text" class="form-control" id="description" name="description">--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="manufacturer">Manufacturer</label>--%>
<%--                    <input type="text" class="form-control" id="manufacturer" name="manufacturer">--%>
<%--                </div>--%>

<%--                <tr>--%>
<%--                    <td></td>--%>
<%--                    <td><input type="submit" value="Create product"></td>--%>
<%--                </tr>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<script src="/static/jquery/jquery-3.5.1.min.js"></script>--%>
<%--<script src="/static/bootstrap413/js/popper.min.js"></script>--%>
<%--<script src="/static/datatables/js/jquery.dataTables.min.js"></script>--%>
<%--<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>--%>
<%--<script src="/static/bootstrap413/js/bootstrap.min.js"></script>--%>
<%--<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>--%>


<%--<script>--%>
<%--    // Disable form submissions if there are invalid fields--%>
<%--    (function() {--%>
<%--        'use strict';--%>
<%--        window.addEventListener('load', function() {--%>
<%--            // Get the forms we want to add validation styles to--%>
<%--            var forms = document.getElementsByClassName('needs-validation');--%>
<%--            // Loop over them and prevent submission--%>
<%--            var validation = Array.prototype.filter.call(forms, function(form) {--%>
<%--                form.addEventListener('submit', function(event) {--%>
<%--                    if (form.checkValidity() === false) {--%>
<%--                        event.preventDefault();--%>
<%--                        event.stopPropagation();--%>
<%--                    }--%>
<%--                    form.classList.add('was-validated');--%>
<%--                }, false);--%>
<%--            });--%>
<%--        }, false);--%>
<%--    })();--%>
<%--</script>--%>
<%--</body>--%>
<%--</html>--%>