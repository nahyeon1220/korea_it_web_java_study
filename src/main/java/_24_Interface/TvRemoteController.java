package _24_Interface;

public class TvRemoteController {

    //TvRemoteController라는 아래에 있는 5개의 변수를 가지고 있음.
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;


    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelUpButton.onDown();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }
}
