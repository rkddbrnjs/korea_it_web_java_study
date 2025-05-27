package _24_Interface;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    //AllargsConstructor
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }
    public void onPressedPowerButton(){
        System.out.print("TV의");
        powerButton.onPressed();
    }
    public void onUpChannelUpButton(){
        System.out.print("TV의");
        channelUpButton.onUp();
    }
    public void onPressedChannelUpButton(){
        System.out.print("TV의");
        channelUpButton.onPressed();
    }
    public void onDownChannelDownButton(){
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }
    public void onPressedChannelDownButton(){
        System.out.print("TV의");
        channelDownButton.onDown();
    }
    public void onUpvolumeUpButton(){
        System.out.print("TV의");
        volumeUpButton.onUp();
    }
    public void onPressedvolumeUpButton(){
        System.out.print("TV의");
        volumeUpButton.onPressed();
    }
    public void onDownvolumeDownButton(){
        System.out.print("TV의");
        volumeDownButton.onDown();
    }
    public void onPressedvolumeDownButton(){
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

}
