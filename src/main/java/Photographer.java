public class Photographer {
    private final Camera camera;

    public Photographer(Camera camera) {
        this.camera = camera;
    }

    public void takePhotograph() {
        camera.takePhotograph(100);
    }



}
