<html>
    <body>
        <div>List of bands</div>
        <#list bands as band>
            <div>
                <b>${band.name}</b>
                <b>${band.foundation}</b>
                <b>${band.origin}</b>
            </div>
        </#list>
    </body>
</html>
