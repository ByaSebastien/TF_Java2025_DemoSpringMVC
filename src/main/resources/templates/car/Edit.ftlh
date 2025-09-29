<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Ajouter une voiture</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 2rem;
        }
        form {
            max-width: 500px;
            padding: 1rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        label {
            display: block;
            margin-top: 1rem;
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 0.5rem;
            margin-top: 0.3rem;
            box-sizing: border-box;
        }
        button {
            margin-top: 1.5rem;
            padding: 0.7rem 1.5rem;
            background-color: #4CAF50;
            border: none;
            color: white;
            font-size: 1rem;
            cursor: pointer;
            border-radius: 4px;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h1>Modifier une voiture</h1>
    <form action="/edit/${id}" method="post">
        <label for="brand">Marque : </label>
        <input type="text" id="brand" name="brand" value="${car.brand}">

        <label for="model">Modèle : </label>
        <input type="text" id="model" name="model" value="${car.model}">

        <label for="horsePower">Puissance : </label>
        <input type="number" id="horsePower" name="horsePower" value="${car.horsePower}">

        <label for="engineCylinder">Cylindrée : </label>
        <input type="number" id="engineCylinder" name="engineCylinder" value="${car.engineCylinder}">

        <button type="submit">Modifier</button>
    </form>
    <a href="/">Retour à la liste</a>
</body>
</html>