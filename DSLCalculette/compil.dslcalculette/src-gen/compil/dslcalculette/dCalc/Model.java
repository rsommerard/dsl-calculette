/**
 */
package compil.dslcalculette.dCalc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compil.dslcalculette.dCalc.Model#getAbstractExpressions <em>Abstract Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see compil.dslcalculette.dCalc.DCalcPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Expressions</b></em>' containment reference list.
   * The list contents are of type {@link compil.dslcalculette.dCalc.AbstractExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Expressions</em>' containment reference list.
   * @see compil.dslcalculette.dCalc.DCalcPackage#getModel_AbstractExpressions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractExpression> getAbstractExpressions();

} // Model
