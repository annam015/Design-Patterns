package builder.classes;

public class Patient implements IPatient {
	private String name;
	private boolean hasFoldingBed;
	private boolean hasBreakfast;
	private boolean hasSlippers;
	private boolean hasRobe;
	
	public Patient(String name, boolean hasFoldingBed, boolean hasBreakfast, boolean hasSlippers, boolean hasRobe) {
		this.name = name;
		this.hasFoldingBed = hasFoldingBed;
		this.hasBreakfast = hasBreakfast;
		this.hasSlippers = hasSlippers;
		this.hasRobe = hasRobe;
	}

	@Override
	public void setName(String name) {
		if(name.length() > 2) {
			this.name = name;
		}		
	}

	@Override
	public void describe() {
		System.out.println("Patient - name: " + this.name + ", has folding bed: " + this.hasFoldingBed + ", has breakfast: "
						+ this.hasBreakfast + ", has slippers: " + this.hasSlippers + ", has robe: " + this.hasRobe);
	}
	
}