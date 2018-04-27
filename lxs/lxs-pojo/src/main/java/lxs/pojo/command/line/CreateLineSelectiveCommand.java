package lxs.pojo.command.line;

import hg.common.component.BaseCommand;

@SuppressWarnings("serial")
public class CreateLineSelectiveCommand extends BaseCommand {
	private String lineId;
	
	private String type;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

}
