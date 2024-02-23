package structural_design_patterns.bridge_pattern;

/**
 * BridgePattern
 * <p>
 * We used the bridge pattern when we have hierarchy grow in two different direction with birdge pattern we can 
 * split this complex hierarchy to two different simple hierarchy.
 */
public class Main {
	public static void main(String[] args) {
		RemoteControl remoteControl = new AdvancedRemoteControl(new SonyTV());
		remoteControl.turnOn();
	}
}
