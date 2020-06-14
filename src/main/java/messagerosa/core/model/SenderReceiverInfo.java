package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SenderReceiverInfo {
	private String userIdentifier;
	private String campaignId;
	private String formId;
	private boolean bot;
	private boolean broadcast;
}