/**
 */
package org.wso2.developerstudio.datamapper.impl;

import org.eclipse.emf.ecore.EClass;
import org.wso2.developerstudio.datamapper.DataMapperOperatorType;
import org.wso2.developerstudio.datamapper.DataMapperPackage;
import org.wso2.developerstudio.datamapper.Divide;
import org.wso2.developerstudio.datamapper.SchemaDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divide</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DivideImpl extends OperatorImpl implements Divide {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DivideImpl() {
		super();
		setDefaultInputConnectors(2);
		setDefaultOutputConnectors(1);
		setInputSizeFixed(true);
		setOutputSizeFixed(true);
		getInputVariableType().add(SchemaDataType.INT);
		getInputVariableType().add(SchemaDataType.DOUBLE);
		getOutputVariableType().add(SchemaDataType.DOUBLE);
		setOperatorType(DataMapperOperatorType.DIVIDE);
		getInputLabelList().add("Num");
		getInputLabelList().add("DivideBy");
		getOutputLabelList().add("Out");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataMapperPackage.Literals.DIVIDE;
	}

} //DivideImpl
