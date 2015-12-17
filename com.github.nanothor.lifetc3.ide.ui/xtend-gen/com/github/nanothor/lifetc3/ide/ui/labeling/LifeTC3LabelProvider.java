/**
 * generated by Xtext
 */
package com.github.nanothor.lifetc3.ide.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class LifeTC3LabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public LifeTC3LabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
