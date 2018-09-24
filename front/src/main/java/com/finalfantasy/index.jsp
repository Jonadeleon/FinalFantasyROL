<!DOCTYPE html>
<html lang="en">
<head>
    <title>FINAL FANTASY</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

</head>
<body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="index.ftl">FINAL FANTASY</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </nav>

    <main role="main">

        <div class="jumbotron">
            <div class="container">
                <h1 class="display-3">Final Fantasy Rol</h1>
                <p>Que es lo que quieres ver?</p>
            </div>
        </div>

        <div class="container">
            <div>
                <form action="clases.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Clases</button>
                </form>
            </div>

            <div>
                <form action="razas.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Razas</button>
                </form>
            </div>

            <div>
                <form action="armaduras.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Armaduras</button>
                </form>
            </div>


            <div>
                <form action="armas.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Armas</button>
                </form>
            </div>

            <div>
                <form action="materias.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Materias</button>
                </form>
            </div>

            <div>
                <form action="items.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Items</button>
                </form>
            </div>

            <div>
                <form action="personajes.jsp">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Ver Personajes</button>
                </form>
            </div>


        </div>

    </main>

</body>
</html>
