package structural_design_patterns.bridge_pattern;

public class AdvancedRemoteControl extends RemoteControl{
	
	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	public void setChannel(int channelNum) {
		device.setChannel(channelNum);
	}
}
