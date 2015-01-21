/**
 */
package compil.dslcalculette.dCalc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see compil.dslcalculette.dCalc.DCalcFactory
 * @model kind="package"
 * @generated
 */
public interface DCalcPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dCalc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslcalculette.compil/DCalc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dCalc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DCalcPackage eINSTANCE = compil.dslcalculette.dCalc.impl.DCalcPackageImpl.init();

  /**
   * The meta object id for the '{@link compil.dslcalculette.dCalc.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see compil.dslcalculette.dCalc.impl.ModelImpl
   * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Abstract Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ABSTRACT_EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link compil.dslcalculette.dCalc.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see compil.dslcalculette.dCalc.impl.AbstractExpressionImpl
   * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getAbstractExpression()
   * @generated
   */
  int ABSTRACT_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Abstract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link compil.dslcalculette.dCalc.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see compil.dslcalculette.dCalc.impl.ExpressionImpl
   * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operateur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATEUR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Signe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SIGNE = 3;

  /**
   * The feature id for the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALEUR = 4;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link compil.dslcalculette.dCalc.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see compil.dslcalculette.dCalc.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link compil.dslcalculette.dCalc.Model#getAbstractExpressions <em>Abstract Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstract Expressions</em>'.
   * @see compil.dslcalculette.dCalc.Model#getAbstractExpressions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AbstractExpressions();

  /**
   * Returns the meta object for class '{@link compil.dslcalculette.dCalc.AbstractExpression <em>Abstract Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Expression</em>'.
   * @see compil.dslcalculette.dCalc.AbstractExpression
   * @generated
   */
  EClass getAbstractExpression();

  /**
   * Returns the meta object for the containment reference '{@link compil.dslcalculette.dCalc.AbstractExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see compil.dslcalculette.dCalc.AbstractExpression#getExpression()
   * @see #getAbstractExpression()
   * @generated
   */
  EReference getAbstractExpression_Expression();

  /**
   * Returns the meta object for class '{@link compil.dslcalculette.dCalc.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see compil.dslcalculette.dCalc.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link compil.dslcalculette.dCalc.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see compil.dslcalculette.dCalc.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link compil.dslcalculette.dCalc.Expression#getOperateur <em>Operateur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operateur</em>'.
   * @see compil.dslcalculette.dCalc.Expression#getOperateur()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operateur();

  /**
   * Returns the meta object for the containment reference '{@link compil.dslcalculette.dCalc.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see compil.dslcalculette.dCalc.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link compil.dslcalculette.dCalc.Expression#getSigne <em>Signe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signe</em>'.
   * @see compil.dslcalculette.dCalc.Expression#getSigne()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Signe();

  /**
   * Returns the meta object for the attribute '{@link compil.dslcalculette.dCalc.Expression#getValeur <em>Valeur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valeur</em>'.
   * @see compil.dslcalculette.dCalc.Expression#getValeur()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Valeur();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DCalcFactory getDCalcFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link compil.dslcalculette.dCalc.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see compil.dslcalculette.dCalc.impl.ModelImpl
     * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Abstract Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ABSTRACT_EXPRESSIONS = eINSTANCE.getModel_AbstractExpressions();

    /**
     * The meta object literal for the '{@link compil.dslcalculette.dCalc.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see compil.dslcalculette.dCalc.impl.AbstractExpressionImpl
     * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getAbstractExpression()
     * @generated
     */
    EClass ABSTRACT_EXPRESSION = eINSTANCE.getAbstractExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_EXPRESSION__EXPRESSION = eINSTANCE.getAbstractExpression_Expression();

    /**
     * The meta object literal for the '{@link compil.dslcalculette.dCalc.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see compil.dslcalculette.dCalc.impl.ExpressionImpl
     * @see compil.dslcalculette.dCalc.impl.DCalcPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operateur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATEUR = eINSTANCE.getExpression_Operateur();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Signe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__SIGNE = eINSTANCE.getExpression_Signe();

    /**
     * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__VALEUR = eINSTANCE.getExpression_Valeur();

  }

} //DCalcPackage
