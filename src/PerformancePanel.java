import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import PerformancePanelPackage.DashboardPanel;
import PerformancePanelPackage.HistoryPanel;
import PerformancePanelPackage.MyPlans;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Component;

@SuppressWarnings("serial")
public class PerformancePanel extends JPanel {
	
	private DashboardPanel dashboardPanel;
	private MyPlans myPlans;
	private HistoryPanel historyPanel;

	public PerformancePanel() {	
		
		dashboardPanel = new DashboardPanel();
		historyPanel = new HistoryPanel();
		historyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		historyPanel.setPreferredSize(new Dimension(654, 479));
		myPlans = new MyPlans();
		
		GridBagLayout gridBagLayout = (GridBagLayout) dashboardPanel.getLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, -5};
		
		setLayout(new BorderLayout(0, 0));
		
		JXTabbedPane tabbedPane = new JXTabbedPane(JTabbedPane.LEFT);
        AbstractTabRenderer renderer = (AbstractTabRenderer)tabbedPane.getTabRenderer();
        renderer.setPrototypeText("This text is a prototype");
        renderer.setHorizontalTextAlignment(SwingConstants.LEADING);
		
		UIManager.put("TabbedPane.selected", Color.red);
//		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
//		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
//		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(tabbedPane, BorderLayout.CENTER);
		
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add DashbboardPanel and Icon
        ImageIcon iconDash = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.TH_LARGE, 30.0f, Color.BLACK);
        tabbedPane.addTab("Dashboard  ", iconDash, dashboardPanel, null);
		
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 10;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 3;
		dashboardPanel.add(separator, gbc_separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 10;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 6;
		gbc_separator_2.gridy = 3;
		dashboardPanel.add(separator_2, gbc_separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 10;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 7;
		gbc_separator_1.gridy = 3;
		dashboardPanel.add(separator_1, gbc_separator_1);
		
		//History change icon
		ImageIcon iconHistory = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.HISTORY, 30.0f, Color.BLACK);
		tabbedPane.addTab("History  ", iconHistory, historyPanel, null);
				
				
		//My Plans change icon
		ImageIcon iconPlans = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.LIST, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Plans  ", iconPlans, myPlans, null);
				
		//My Clips change icon
		JPanel panelMyClips = new JPanel();
		ImageIcon iconClips = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.YOUTUBE_PLAY, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Clips  ", iconClips, panelMyClips, null);	
	}	
	
/////////////////////////////////
	 
	class JXTabbedPane extends JTabbedPane {

        private ITabRenderer tabRenderer = new DefaultTabRenderer();

        public JXTabbedPane() {
            super();
        }

        public JXTabbedPane(int tabPlacement) {
            super(tabPlacement);
        }

        public JXTabbedPane(int tabPlacement, int tabLayoutPolicy) {
            super(tabPlacement, tabLayoutPolicy);
        }

        public ITabRenderer getTabRenderer() {
            return tabRenderer;
        }

        public void setTabRenderer(ITabRenderer tabRenderer) {
            this.tabRenderer = tabRenderer;
        }

//        @Override
//        public void addTab(String title, Component component) {
//            this.addTab(title, null, component, null);
//        }

//        @Override
//        public void addTab(String title, Icon icon, Component component) {
//            this.addTab(title, icon, component, null);
//        }

        @Override
        public void addTab(String title, Icon icon, Component component, String tip) {
            super.addTab(title, icon, component, tip);
            int tabIndex = getTabCount() - 1;
            Component tab = tabRenderer.getTabRendererComponent(this, title, icon, tabIndex);
            super.setTabComponentAt(tabIndex, tab);
        }
        
    }

    interface ITabRenderer {

        public Component getTabRendererComponent(JTabbedPane tabbedPane, String text, Icon icon, int tabIndex);

    }

    abstract class AbstractTabRenderer implements ITabRenderer {

        private String prototypeText = "";
        private Icon prototypeIcon = UIManager.getIcon("OptionPane.informationIcon");
        private int horizontalTextAlignment = SwingConstants.CENTER;
        private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

        public AbstractTabRenderer() {
            super();
        }

        public void setPrototypeText(String text) {
            String oldText = this.prototypeText;
            this.prototypeText = text;
            firePropertyChange("prototypeText", oldText, text);
        }

        public String getPrototypeText() {
            return prototypeText;
        }

        public Icon getPrototypeIcon() {
            return prototypeIcon;
        }

        public void setPrototypeIcon(Icon icon) {
            Icon oldIcon = this.prototypeIcon;
            this.prototypeIcon = icon;
            firePropertyChange("prototypeIcon", oldIcon, icon);
        }

        public int getHorizontalTextAlignment() {
            return horizontalTextAlignment;
        }

        public void setHorizontalTextAlignment(int horizontalTextAlignment) {
            this.horizontalTextAlignment = horizontalTextAlignment;
        }

        public PropertyChangeListener[] getPropertyChangeListeners() {
            return propertyChangeSupport.getPropertyChangeListeners();
        }

        public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
            return propertyChangeSupport.getPropertyChangeListeners(propertyName);
        }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
            propertyChangeSupport.addPropertyChangeListener(listener);
        }

        public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
            propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
        }

        protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
            PropertyChangeListener[] listeners = getPropertyChangeListeners();
            for (int i = listeners.length - 1; i >= 0; i--) {
                listeners[i].propertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
            }
        }
    }

    class DefaultTabRenderer extends AbstractTabRenderer implements PropertyChangeListener {

        private Component prototypeComponent;

        public DefaultTabRenderer() {
            super();
            prototypeComponent = generateRendererComponent(getPrototypeText(), getPrototypeIcon(), getHorizontalTextAlignment());
            addPropertyChangeListener(this);
        }

        private Component generateRendererComponent(String text, Icon icon, int horizontalTabTextAlignmen) {
            JPanel rendererComponent = new JPanel(new GridBagLayout());
            rendererComponent.setOpaque(false);

            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(2, 4, 2, 4);
            c.fill = GridBagConstraints.HORIZONTAL;
            rendererComponent.add(new JLabel(icon), c);

            c.gridx = 1;
            c.weightx = 1;
            rendererComponent.add(new JLabel(text, horizontalTabTextAlignmen), c);

            return rendererComponent;
        }

        @Override
        public Component getTabRendererComponent(JTabbedPane tabbedPane, String text, Icon icon, int tabIndex) {
            Component rendererComponent = generateRendererComponent(text, icon, getHorizontalTextAlignment());
            int prototypeWidth = prototypeComponent.getPreferredSize().width;
            int prototypeHeight = prototypeComponent.getPreferredSize().height;
            rendererComponent.setPreferredSize(new Dimension(prototypeWidth, prototypeHeight));
            return rendererComponent;
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            String propertyName = evt.getPropertyName();
            if ("prototypeText".equals(propertyName) || "prototypeIcon".equals(propertyName)) {
                this.prototypeComponent = generateRendererComponent(getPrototypeText(), getPrototypeIcon(), getHorizontalTextAlignment());
            }
        }
    }
	
}
