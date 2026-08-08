interface Standard
{
    void videoPlaying();
}
interface Premium
{
    void adFree();
    void ytMusic();
}
class Youtube implements Premium
{
    public void videoPlaying()
    {
        System.out.println("You can watch videos.");
    }

    public void adFree()
    {
        System.out.println("You can watch videos adFree.");
    }

    public void ytMusic()
    {
        System.out.println("You can vibe to songs.");
    }
}

class Google
{
    public static void main (String[] args)
    {
        Standard vaibhav = new Youtube();
        vaibhav.videoPlaying();

        Premium parth = new Youtube();
        parth.adFree();
        parth.ytMusic();
        parth.videoPlaying();
    }
}