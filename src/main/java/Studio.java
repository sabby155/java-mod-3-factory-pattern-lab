public class Studio {
    private Camera CanonCamera;

    public void createPhotograper() {
        Photographer myPhotographer = new Photographer(CanonCamera);
        myPhotographer.takePhotograph();
    }
}


