/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.providers.UmaMessages;


// End of user code

/**
 * 
 * 
 */
public class ConfigurationPackagePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConfigurationPackagePropertiesEditionPart {

	protected Text name;
protected ReferencesTable ownedMethodContentMember;
protected List<ViewerFilter> ownedMethodContentMemberBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> ownedMethodContentMemberFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable reusedPackage;
	protected List<ViewerFilter> reusedPackageBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> reusedPackageFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable ownedConfiguration;
protected List<ViewerFilter> ownedConfigurationBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> ownedConfigurationFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigurationPackagePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence configurationPackageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = configurationPackageStep.addStep(UmaViewsRepository.ConfigurationPackage.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.ConfigurationPackage.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember);
		propertiesStep.addStep(UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage);
		propertiesStep.addStep(UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration);
		
		
		composer = new PartComposer(configurationPackageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.ConfigurationPackage.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == UmaViewsRepository.ConfigurationPackage.Properties.name) {
					return createNameText(parent);
				}
				if (key == UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember) {
					return createOwnedMethodContentMemberAdvancedTableComposition(parent);
				}
				if (key == UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage) {
					return createReusedPackageAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration) {
					return createOwnedConfigurationAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(UmaMessages.ConfigurationPackagePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, UmaMessages.ConfigurationPackagePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(UmaViewsRepository.ConfigurationPackage.Properties.name, UmaViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, UmaViewsRepository.ConfigurationPackage.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ConfigurationPackage.Properties.name, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedMethodContentMemberAdvancedTableComposition(Composite parent) {
		this.ownedMethodContentMember = new ReferencesTable(UmaMessages.ConfigurationPackagePropertiesEditionPart_OwnedMethodContentMemberLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedMethodContentMember.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedMethodContentMember.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedMethodContentMember.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedMethodContentMember.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedMethodContentMemberFilters) {
			this.ownedMethodContentMember.addFilter(filter);
		}
		this.ownedMethodContentMember.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, UmaViewsRepository.SWT_KIND));
		this.ownedMethodContentMember.createControls(parent);
		this.ownedMethodContentMember.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedMethodContentMemberData = new GridData(GridData.FILL_HORIZONTAL);
		ownedMethodContentMemberData.horizontalSpan = 3;
		this.ownedMethodContentMember.setLayoutData(ownedMethodContentMemberData);
		this.ownedMethodContentMember.setLowerBound(0);
		this.ownedMethodContentMember.setUpperBound(-1);
		ownedMethodContentMember.setID(UmaViewsRepository.ConfigurationPackage.Properties.ownedMethodContentMember);
		ownedMethodContentMember.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReusedPackageAdvancedReferencesTable(Composite parent) {
		this.reusedPackage = new ReferencesTable(UmaMessages.ConfigurationPackagePropertiesEditionPart_ReusedPackageLabel, new ReferencesTableListener() {
			public void handleAdd() { addReusedPackage(); }
			public void handleEdit(EObject element) { editReusedPackage(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReusedPackage(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReusedPackage(element); }
			public void navigateTo(EObject element) { }
		});
		this.reusedPackage.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage, UmaViewsRepository.SWT_KIND));
		this.reusedPackage.createControls(parent);
		this.reusedPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData reusedPackageData = new GridData(GridData.FILL_HORIZONTAL);
		reusedPackageData.horizontalSpan = 3;
		this.reusedPackage.setLayoutData(reusedPackageData);
		this.reusedPackage.disableMove();
		reusedPackage.setID(UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage);
		reusedPackage.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReusedPackage() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(reusedPackage.getInput(), reusedPackageFilters, reusedPackageBusinessFilters,
		"reusedPackage", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				reusedPackage.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReusedPackage(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		reusedPackage.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReusedPackage(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.reusedPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		reusedPackage.refresh();
	}

	/**
	 * 
	 */
	protected void editReusedPackage(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				reusedPackage.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedConfigurationAdvancedTableComposition(Composite parent) {
		this.ownedConfiguration = new ReferencesTable(UmaMessages.ConfigurationPackagePropertiesEditionPart_OwnedConfigurationLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedConfiguration.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedConfiguration.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedConfiguration.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedConfiguration.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedConfigurationFilters) {
			this.ownedConfiguration.addFilter(filter);
		}
		this.ownedConfiguration.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, UmaViewsRepository.SWT_KIND));
		this.ownedConfiguration.createControls(parent);
		this.ownedConfiguration.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPackagePropertiesEditionPartImpl.this, UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedConfigurationData = new GridData(GridData.FILL_HORIZONTAL);
		ownedConfigurationData.horizontalSpan = 3;
		this.ownedConfiguration.setLayoutData(ownedConfigurationData);
		this.ownedConfiguration.setLowerBound(0);
		this.ownedConfiguration.setUpperBound(-1);
		ownedConfiguration.setID(UmaViewsRepository.ConfigurationPackage.Properties.ownedConfiguration);
		ownedConfiguration.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#initOwnedMethodContentMember(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedMethodContentMember(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedMethodContentMember.setContentProvider(contentProvider);
		ownedMethodContentMember.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#updateOwnedMethodContentMember()
	 * 
	 */
	public void updateOwnedMethodContentMember() {
	ownedMethodContentMember.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addFilterOwnedMethodContentMember(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedMethodContentMember(ViewerFilter filter) {
		ownedMethodContentMemberFilters.add(filter);
		if (this.ownedMethodContentMember != null) {
			this.ownedMethodContentMember.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addBusinessFilterOwnedMethodContentMember(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodContentMember(ViewerFilter filter) {
		ownedMethodContentMemberBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#isContainedInOwnedMethodContentMemberTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedMethodContentMemberTable(EObject element) {
		return ((ReferencesTableSettings)ownedMethodContentMember.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#initReusedPackage(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReusedPackage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		reusedPackage.setContentProvider(contentProvider);
		reusedPackage.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#updateReusedPackage()
	 * 
	 */
	public void updateReusedPackage() {
	reusedPackage.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addFilterReusedPackage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReusedPackage(ViewerFilter filter) {
		reusedPackageFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addBusinessFilterReusedPackage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReusedPackage(ViewerFilter filter) {
		reusedPackageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#isContainedInReusedPackageTable(EObject element)
	 * 
	 */
	public boolean isContainedInReusedPackageTable(EObject element) {
		return ((ReferencesTableSettings)reusedPackage.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#initOwnedConfiguration(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedConfiguration(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedConfiguration.setContentProvider(contentProvider);
		ownedConfiguration.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#updateOwnedConfiguration()
	 * 
	 */
	public void updateOwnedConfiguration() {
	ownedConfiguration.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addFilterOwnedConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedConfiguration(ViewerFilter filter) {
		ownedConfigurationFilters.add(filter);
		if (this.ownedConfiguration != null) {
			this.ownedConfiguration.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#addBusinessFilterOwnedConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedConfiguration(ViewerFilter filter) {
		ownedConfigurationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.spem.uma.parts.ConfigurationPackagePropertiesEditionPart#isContainedInOwnedConfigurationTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedConfigurationTable(EObject element) {
		return ((ReferencesTableSettings)ownedConfiguration.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.ConfigurationPackage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
