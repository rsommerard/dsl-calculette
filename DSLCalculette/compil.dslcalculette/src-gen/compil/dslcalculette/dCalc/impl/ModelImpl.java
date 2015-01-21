/**
 */
package compil.dslcalculette.dCalc.impl;

import compil.dslcalculette.dCalc.AbstractExpression;
import compil.dslcalculette.dCalc.DCalcPackage;
import compil.dslcalculette.dCalc.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ModelImpl#getAbstractExpressions <em>Abstract Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getAbstractExpressions() <em>Abstract Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractExpressions()
   * @generated
   * @ordered
   */
  protected EList<AbstractExpression> abstractExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DCalcPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractExpression> getAbstractExpressions()
  {
    if (abstractExpressions == null)
    {
      abstractExpressions = new EObjectContainmentEList<AbstractExpression>(AbstractExpression.class, this, DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS);
    }
    return abstractExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS:
        return ((InternalEList<?>)getAbstractExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS:
        return getAbstractExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS:
        getAbstractExpressions().clear();
        getAbstractExpressions().addAll((Collection<? extends AbstractExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS:
        getAbstractExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DCalcPackage.MODEL__ABSTRACT_EXPRESSIONS:
        return abstractExpressions != null && !abstractExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
