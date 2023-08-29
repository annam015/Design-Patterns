package builder.classes;

public interface IBuilder {
	public Patient build();
	public IBuilder setHasFoldingBed(boolean hasFoldingBed);
	public IBuilder setHasBreakfast(boolean hasBreakfast);
	public IBuilder setHasSlippers(boolean hasSlippers);
	public IBuilder setHasRobe(boolean hasRobe);
}