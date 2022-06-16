<%-- 
    Document   : css-js
    Created on : 27/02/2019, 10:28:45 AM
    Author     : Angel Albinagorta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<meta charset="UTF-8">
<link rel="shortcut icon" href="Imagen/icono.ico" />

<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/sweetalert2.css">
<link rel="stylesheet" href="css/material.min.css">
<link rel="stylesheet" href="css/material-design-iconic-font.min.css">
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
<link rel="stylesheet" href="css/main.css">
<link href="css/bootstrapp.min.css" rel="stylesheet" type="text/css"/>
<script src="js/jqueryy.js" type="text/javascript"></script>    
<script src="js/BuscadorTabla.js" type="text/javascript"></script>
<script src="js/bootstrapp.min.js" type="text/javascript"></script> 
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
<script src="js/material.min.js" ></script>
<script src="js/sweetalert2.min.js" ></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js" ></script>
<script src="js/main.js" ></script>

<script  type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="JavaScript/paginacion.js"></script>




<!--codigo de paginacion-->
<style>

    ulll {
        list-style: none;
        margin-top: 10px;
        padding: 0;
    }

    liii {
        border-radius: 3px;
        color: black;
        background: #F4C20B;
        cursor: pointer;
        display: inline;
        font-weight: 200;
        margin: 10px 5px 0px 2px;
        padding: 10px;
        text-align: center;
        width: 10px;
    }

    .activeee {
        background: teal;
        color: white;
    }
</style>


<script type="text/javascript">
    $(function () {
        $("#datos").pagination();
    });
</script>
<script type="text/javascript">

    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', 'UA-36251023-1']);
    _gaq.push(['_setDomainName', 'jqueryscript.net']);
    _gaq.push(['_trackPageview']);

    (function () {
        var ga = document.createElement('script');
        ga.type = 'text/javascript';
        ga.async = true;
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(ga, s);
    })();

</script>   
