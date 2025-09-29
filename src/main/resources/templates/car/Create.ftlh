<#import "/spring.ftl" as spring>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter une voiture</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 2rem; }
        form { max-width: 500px; padding: 1rem; border: 1px solid #ccc; border-radius: 8px; background-color: #f9f9f9; }
        label { display: block; margin-top: 1rem; font-weight: bold; }
        input { width: 100%; padding: 0.5rem; margin-top: 0.3rem; box-sizing: border-box; }
        button { margin-top: 1.5rem; padding: 0.7rem 1.5rem; background-color: #4CAF50; border: none; color: white; font-size: 1rem; cursor: pointer; border-radius: 4px; }
        button:hover { background-color: #45a049; }
        .error { color: red; margin-top: 0.2rem; }
    </style>
</head>
<body>

<h1>Ajouter une voiture</h1>

<form action="/create" method="post">

    <label for="brand">Marque :</label>
    <@spring.bind "form.brand"/>
    <input type="text" id="brand" name="brand" value="${spring.status.value!}"/>
    <@spring.showErrors ' ' 'error'/>

    <label for="model">Modèle :</label>
    <@spring.bind "form.model"/>
    <input type="text" id="model" name="model" value="${spring.status.value!}"/>
    <#if spring.status.error>
        <ul class="error">
            <#list spring.status.errorMessages as err>
                <li>${err}</li>
            </#list>
        </ul>
    </#if>

    <label for="horsePower">Puissance :</label>
    <@spring.bind "form.horsePower"/>
    <input type="number" id="horsePower" name="horsePower" value="${spring.status.value!}"/>
    <#if spring.status.error>
        <ul class="error">
            <#list spring.status.errorMessages as err>
                <li>${err}</li>
            </#list>
        </ul>
    </#if>

    <label for="engineCylinder">Cylindrée :</label>
    <@spring.bind "form.engineCylinder"/>
    <input type="number" id="engineCylinder" name="engineCylinder" value="${spring.status.value!}"/>
    <#if spring.status.error>
        <ul class="error">
            <#list spring.status.errorMessages as err>
                <li>${err}</li>
            </#list>
        </ul>
    </#if>

    <button type="submit">Ajouter</button>
</form>

<a href="/">Retour à la liste</a>

</body>
</html>
