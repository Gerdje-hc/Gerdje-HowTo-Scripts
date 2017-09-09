/**
 * Beschrijft het personage Supermario.
 *
 * @Dominiek Vandewalle
 * @17/08/2014
 */
public class SuperMario
{
    // coordinaten van SuperMario op het scherm
    private int x;
    private int y;
    private String lengte;

    /**
     * Maakt een instantie aan van de Klasse SuperMario
     */
    public SuperMario()
    {
        x = 0;
        y = 0;
        lengte = "groot";
    }

    /**
     * Verplaatst SuperMario een plaats naar links.
     */
    public void pijlLinks()
    {
        x--;
        x = Math.max(0,x);
    }

    /**
     * Verplaatst SuperMario een plaats naar rechts.
     */
    public void pijlRechts()
    {
        x++;
    }

    /**
     * Verplaatst SuperMario twee plaatsen omhoog.
     */
    public void pijlOmhoogIndrukken()
    {
        y += 2;
    }

    /**
     * verplaatst SuperMario twee plaatsen omlaag.
     */
    public void pijlOmhoogLoslaten()
    {
        y -= 2;
        y = Math.max(0,y);
    }

    /**
     * maak SuperMario klein.
     */
    public void pijlOmlaagIndrukken()
    {
        lengte = "klein";
    }

    /**
     * maak SuperMario groot.
     */
    public void pijlOmlaagLoslaten()
    {
        lengte = "groot";
    }
}

