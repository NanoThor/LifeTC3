/**
 */
package com.github.nanothor.lifetc3.ide.lifeTC3.impl;

import com.github.nanothor.lifetc3.ide.lifeTC3.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifeTC3FactoryImpl extends EFactoryImpl implements LifeTC3Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LifeTC3Factory init()
  {
    try
    {
      LifeTC3Factory theLifeTC3Factory = (LifeTC3Factory)EPackage.Registry.INSTANCE.getEFactory(LifeTC3Package.eNS_URI);
      if (theLifeTC3Factory != null)
      {
        return theLifeTC3Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LifeTC3FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LifeTC3FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LifeTC3Package.PROG: return createProg();
      case LifeTC3Package.VARIABLE: return createVariable();
      case LifeTC3Package.CONSTANT: return createConstant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prog createProg()
  {
    ProgImpl prog = new ProgImpl();
    return prog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LifeTC3Package getLifeTC3Package()
  {
    return (LifeTC3Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LifeTC3Package getPackage()
  {
    return LifeTC3Package.eINSTANCE;
  }

} //LifeTC3FactoryImpl
