package builder.classes;

public class PatientBuilder implements IBuilder {
	private String name;
	private boolean hasFoldingBed;
	private boolean hasBreakfast;
	private boolean hasSlippers;
	private boolean hasRobe;
	
	public PatientBuilder(String name) {
		this.name = name;
		this.hasFoldingBed = false;
		this.hasBreakfast = false;
		this.hasSlippers = false;
		this.hasRobe = false;
	}

	@Override
	public Patient build() {
		return new Patient(this.name, this.hasFoldingBed, this.hasBreakfast, this.hasSlippers, this.hasRobe);
	}

	@Override
	public PatientBuilder setHasFoldingBed(boolean hasFoldingBed) {
		this.hasFoldingBed = hasFoldingBed;
		return this;
	}

	@Override
	public PatientBuilder setHasBreakfast(boolean hasBreakfast) {
		this.hasBreakfast = hasBreakfast;
		return this;
	}

	@Override
	public PatientBuilder setHasSlippers(boolean hasSlippers) {
		this.hasSlippers = hasSlippers;
		return this;
	}

	@Override
	public PatientBuilder setHasRobe(boolean hasRobe) {
		this.hasRobe = hasRobe;
		return this;
	}
	
}