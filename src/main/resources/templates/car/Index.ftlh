<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Car Index</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 2rem;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 0.5rem 1rem;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <a href="/create">Creer une nouvelle voiture</a>
    <table>
        <thead>
            <tr>
                <th>Marque</th>
                <th>Modèle</th>
                <th>Puissance</th>
                <th>Cylindrée</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <#list cars as car>
                <tr>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                    <td>${car.horsePower}</td>
                    <td>${car.engineCylinder}</td>
                    <td>
                        <button>Détails</button>
                    </td>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>