package composite.classes;

public interface AbstractComponent {
	public void describe() throws Exception;
	public void addComponent(AbstractComponent component) throws Exception;
	public void deleteComponent(AbstractComponent component) throws Exception;
	public AbstractComponent getComponent(int index) throws Exception;
}