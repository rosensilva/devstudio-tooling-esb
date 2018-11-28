/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ThrottleMediatorPropertiesEditionPart {

	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the commentsList
	 * 
	 */
	public EList getCommentsList();

	/**
	 * Defines a new commentsList
	 * @param newValue the new commentsList to set
	 * 
	 */
	public void setCommentsList(EList newValue);

	/**
	 * Add a value to the commentsList multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToCommentsList(Object newValue);

	/**
	 * Remove a value to the commentsList multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToCommentsList(Object newValue);


	/**
	 * @return the Reverse
	 * 
	 */
	public Boolean getReverse();

	/**
	 * Defines a new Reverse
	 * @param newValue the new Reverse to set
	 * 
	 */
	public void setReverse(Boolean newValue);


	/**
	 * @return the groupId
	 * 
	 */
	public String getGroupId();

	/**
	 * Defines a new groupId
	 * @param newValue the new groupId to set
	 * 
	 */
	public void setGroupId(String newValue);


	/**
	 * @return the policyType
	 * 
	 */
	public Enumerator getPolicyType();

	/**
	 * Init the policyType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPolicyType(Object input, Enumerator current);

	/**
	 * Defines a new policyType
	 * @param newValue the new policyType to set
	 * 
	 */
	public void setPolicyType(Enumerator newValue);


	/**
	 * @return the maxConcurrentAccessCount
	 * 
	 */
	public String getMaxConcurrentAccessCount();

	/**
	 * Defines a new maxConcurrentAccessCount
	 * @param newValue the new maxConcurrentAccessCount to set
	 * 
	 */
	public void setMaxConcurrentAccessCount(String newValue);




	/**
	 * Init the policyEntries
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPolicyEntries(ReferencesTableSettings settings);

	/**
	 * Update the policyEntries
	 * @param newValue the policyEntries to update
	 * 
	 */
	public void updatePolicyEntries();

	/**
	 * Adds the given filter to the policyEntries edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPolicyEntries(ViewerFilter filter);

	/**
	 * Adds the given filter to the policyEntries edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPolicyEntries(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the policyEntries table
	 * 
	 */
	public boolean isContainedInPolicyEntriesTable(EObject element);


	/**
	 * @return the OnAcceptBranchsequenceType
	 * 
	 */
	public Enumerator getOnAcceptBranchsequenceType();

	/**
	 * Init the OnAcceptBranchsequenceType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initOnAcceptBranchsequenceType(Object input, Enumerator current);

	/**
	 * Defines a new OnAcceptBranchsequenceType
	 * @param newValue the new OnAcceptBranchsequenceType to set
	 * 
	 */
	public void setOnAcceptBranchsequenceType(Enumerator newValue);


	/**
	 * @return the OnRejectBranchsequenceType
	 * 
	 */
	public Enumerator getOnRejectBranchsequenceType();

	/**
	 * Init the OnRejectBranchsequenceType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initOnRejectBranchsequenceType(Object input, Enumerator current);

	/**
	 * Defines a new OnRejectBranchsequenceType
	 * @param newValue the new OnRejectBranchsequenceType to set
	 * 
	 */
	public void setOnRejectBranchsequenceType(Enumerator newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
