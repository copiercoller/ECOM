<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">

        <script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>

    </head>
    <body>
        <c:import url="components/header.jsp" />
        <section>
            <div class="container">
                <div class="well">
                    <div class="row">
                        <div class="col-lg-5 form-signin">
                            <h2 class="form-signin-heading">Inscription</h2>
                            <form role="form">
                                <legend>Informations compte</legend>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="email">Email : </label>
                                        <div class="col-md-7">
                                            <input type="email" id="email" class="form-control" placeholder="Adresse e-mail" required autofocus>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="login">Pseudo : </label>
                                        <div class="col-md-7">
                                            <input type="text" id="login" class="form-control" placeholder="Nom d'utilisateur" required />                                
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="password">Mot de passe : </label>
                                        <div class="col-md-7">
                                            <input type="password" id="password" class="form-control" placeholder="Mot de passe" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="conf_pass">Confirmation mot de passe : </label>
                                        <div class="col-md-7">
                                            <input type="password" id="conf_pass" class="form-control" placeholder="Confirmation mot de passe" required>
                                        </div>
                                    </div>
                                </div>
                                <legend>Informations personnelles</legend>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="firstname">Prenom : </label>
                                        <div class="col-md-7">
                                            <input type="text" id="firstname" class="form-control" placeholder="Prenom" required />
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="lastname">Nom : </label>
                                        <div class="col-md-7">
                                            <input type="text" id="lastname" class="form-control" placeholder="Nom" required />
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-md-5 form-label" for="birthday">Date de naissance : </label>
                                        <div class="col-md-7">
                                            <input type="date" id="birthday" class="form-control" placeholder="Date de naissance" required />
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-5"></div>
                                        <div class="col-md-7">
                                            <label class="checkbox">
                                                <input type="checkbox" value="agree">Je confirme avoir pris connaissance des conditions...
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-5"></div>
                                    <input class="btn btn-danger col-md-3" type="reset" />
                                    <input class="btn btn-primary col-md-3" type="submit" />
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.1.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/main.js"></script>

        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            (function (b, o, i, l, e, r) {
                b.GoogleAnalyticsObject = l;
                b[l] || (b[l] =
                        function () {
                            (b[l].q = b[l].q || []).push(arguments)
                        });
                b[l].l = +new Date;
                e = o.createElement(i);
                r = o.getElementsByTagName(i)[0];
                e.src = '//www.google-analytics.com/analytics.js';
                r.parentNode.insertBefore(e, r)
            }(window, document, 'script', 'ga'));
            ga('create', 'UA-XXXXX-X');
            ga('send', 'pageview');
        </script>
    </body>
</html>
