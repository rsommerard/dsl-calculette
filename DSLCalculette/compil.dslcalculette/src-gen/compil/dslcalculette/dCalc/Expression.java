/**
 */
package compil.dslcalculette.dCalc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compil.dslcalculette.dCalc.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.Expression#getOperateur <em>Operateur</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.Expression#getSigne <em>Signe</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.Expression#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link compil.dslcalculette.dCalc.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operateur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operateur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operateur</em>' attribute.
   * @see #setOperateur(String)
   * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression_Operateur()
   * @model
   * @generated
   */
  String getOperateur();

  /**
   * Sets the value of the '{@link compil.dslcalculette.dCalc.Expression#getOperateur <em>Operateur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operateur</em>' attribute.
   * @see #getOperateur()
   * @generated
   */
  void setOperateur(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link compil.dslcalculette.dCalc.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>Signe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signe</em>' attribute.
   * @see #setSigne(String)
   * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression_Signe()
   * @model
   * @generated
   */
  String getSigne();

  /**
   * Sets the value of the '{@link compil.dslcalculette.dCalc.Expression#getSigne <em>Signe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signe</em>' attribute.
   * @see #getSigne()
   * @generated
   */
  void setSigne(String value);

  /**
   * Returns the value of the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valeur</em>' attribute.
   * @see #setValeur(int)
   * @see compil.dslcalculette.dCalc.DCalcPackage#getExpression_Valeur()
   * @model
   * @generated
   */
  int getValeur();

  /**
   * Sets the value of the '{@link compil.dslcalculette.dCalc.Expression#getValeur <em>Valeur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valeur</em>' attribute.
   * @see #getValeur()
   * @generated
   */
  void setValeur(int value);

} // Expression
