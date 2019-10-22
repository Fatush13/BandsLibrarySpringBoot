<html>
    <body>
        <form method="post" action="filter">
            <input type="text" name="filter" placeholder="Search by name"/>
            <button type="submit">Search</button>
        </form>
        <div>List of bands:</div>
        <#list bands as band>
            <div>
                <b>${band.name}</b>
                <b>${band.foundation}</b>
                <b>${band.origin}</b>
            </div>
        </#list>
        <a href="/adding">Add new band</a>
    </body>
</html>
