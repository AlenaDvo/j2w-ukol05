[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <div>Dítě se jménem <strong>${jmeno} ${prijmeni}</strong> narozené dne <strong>${datumNarozeni?date}</strong> bylo zaregistrováno.
        [#if email?? && email!=""]
            Na e-mail <strong>${email}</strong> bylo zasláno potvrzení.
        [/#if]
    </div>
    <br>
    <div>
        <strong>Vámi vyplněné údaje:</strong><br>
        Jméno: ${jmeno}<br>
        Příjmení: ${prijmeni}<br>
        Datum narození: ${datumNarozeni?date}<br>
        Pohlaví: ${pohlavi}<br>
        Turnus: ${turnus}<br>
        [#if email?? && email!=""]E-mail: ${email}<br>[/#if]
        [#if telefon?? && telefon!=""]Telefon: ${telefon}<br>[/#if]
    </div>
</main>
</body>
</html>