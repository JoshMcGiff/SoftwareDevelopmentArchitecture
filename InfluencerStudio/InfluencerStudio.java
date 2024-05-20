public class InfluencerStudio {
    public static void main(String[] args) {
        TikTokLights lights = new TikTokLights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();

        RemoteControl control = new RemoteControl(lights, coffeeMaker, soundSystem, projector);

        control.toggleLight();
        control.startCoffee();
        control.playMusic();
        control.toggleProjector();
    }
}