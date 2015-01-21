/**
 */
package compil.dslcalculette.dCalc.impl;

import compil.dslcalculette.dCalc.DCalcPackage;
import compil.dslcalculette.dCalc.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ExpressionImpl#getOperateur <em>Operateur</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ExpressionImpl#getSigne <em>Signe</em>}</li>
 *   <li>{@link compil.dslcalculette.dCalc.impl.ExpressionImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The default value of the '{@link #getOperateur() <em>Operateur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperateur()
   * @generated
   * @ordered
   */
  protected static final String OPERATEUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperateur() <em>Operateur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperateur()
   * @generated
   * @ordered
   */
  protected String operateur = OPERATEUR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The default value of the '{@link #getSigne() <em>Signe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigne()
   * @generated
   * @ordered
   */
  protected static final String SIGNE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSigne() <em>Signe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigne()
   * @generated
   * @ordered
   */
  protected String signe = SIGNE_EDEFAULT;

  /**
   * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValeur()
   * @generated
   * @ordered
   */
  protected static final int VALEUR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValeur()
   * @generated
   * @ordered
   */
  protected int valeur = VALEUR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return DCalcPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCalcPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCalcPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperateur()
  {
    return operateur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperateur(String newOperateur)
  {
    String oldOperateur = operateur;
    operateur = newOperateur;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__OPERATEUR, oldOperateur, operateur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCalcPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCalcPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSigne()
  {
    return signe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigne(String newSigne)
  {
    String oldSigne = signe;
    signe = newSigne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__SIGNE, oldSigne, signe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValeur()
  {
    return valeur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValeur(int newValeur)
  {
    int oldValeur = valeur;
    valeur = newValeur;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCalcPackage.EXPRESSION__VALEUR, oldValeur, valeur));
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
      case DCalcPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case DCalcPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
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
      case DCalcPackage.EXPRESSION__LEFT:
        return getLeft();
      case DCalcPackage.EXPRESSION__OPERATEUR:
        return getOperateur();
      case DCalcPackage.EXPRESSION__RIGHT:
        return getRight();
      case DCalcPackage.EXPRESSION__SIGNE:
        return getSigne();
      case DCalcPackage.EXPRESSION__VALEUR:
        return getValeur();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DCalcPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case DCalcPackage.EXPRESSION__OPERATEUR:
        setOperateur((String)newValue);
        return;
      case DCalcPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case DCalcPackage.EXPRESSION__SIGNE:
        setSigne((String)newValue);
        return;
      case DCalcPackage.EXPRESSION__VALEUR:
        setValeur((Integer)newValue);
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
      case DCalcPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case DCalcPackage.EXPRESSION__OPERATEUR:
        setOperateur(OPERATEUR_EDEFAULT);
        return;
      case DCalcPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case DCalcPackage.EXPRESSION__SIGNE:
        setSigne(SIGNE_EDEFAULT);
        return;
      case DCalcPackage.EXPRESSION__VALEUR:
        setValeur(VALEUR_EDEFAULT);
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
      case DCalcPackage.EXPRESSION__LEFT:
        return left != null;
      case DCalcPackage.EXPRESSION__OPERATEUR:
        return OPERATEUR_EDEFAULT == null ? operateur != null : !OPERATEUR_EDEFAULT.equals(operateur);
      case DCalcPackage.EXPRESSION__RIGHT:
        return right != null;
      case DCalcPackage.EXPRESSION__SIGNE:
        return SIGNE_EDEFAULT == null ? signe != null : !SIGNE_EDEFAULT.equals(signe);
      case DCalcPackage.EXPRESSION__VALEUR:
        return valeur != VALEUR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operateur: ");
    result.append(operateur);
    result.append(", signe: ");
    result.append(signe);
    result.append(", valeur: ");
    result.append(valeur);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
