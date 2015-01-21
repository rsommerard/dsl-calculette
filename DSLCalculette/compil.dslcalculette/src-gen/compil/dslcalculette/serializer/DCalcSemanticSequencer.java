package compil.dslcalculette.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import compil.dslcalculette.dCalc.AbstractExpression;
import compil.dslcalculette.dCalc.DCalcPackage;
import compil.dslcalculette.dCalc.Expression;
import compil.dslcalculette.dCalc.Model;
import compil.dslcalculette.services.DCalcGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DCalcSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DCalcGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DCalcPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DCalcPackage.ABSTRACT_EXPRESSION:
				if(context == grammarAccess.getAbstractExpressionRule()) {
					sequence_AbstractExpression(context, (AbstractExpression) semanticObject); 
					return; 
				}
				else break;
			case DCalcPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOperandeRule() ||
				   context == grammarAccess.getOperandeAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTermeRule()) {
					sequence_Expression_Operande(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression_Operande_Terme(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case DCalcPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_AbstractExpression(EObject context, AbstractExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCalcPackage.Literals.ABSTRACT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCalcPackage.Literals.ABSTRACT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbstractExpressionAccess().getExpressionExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=Operande_Expression_1_0 (operateur='*' | operateur='/') right=Expression) | 
	 *         (left=Expression_Expression_1_0 (operateur='+' | operateur='-') right=Expression)
	 *     )
	 */
	protected void sequence_Expression_Operande(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (signe='-' valeur=INT) | 
	 *         valeur=INT | 
	 *         (left=Operande_Expression_1_0 (operateur='*' | operateur='/') right=Expression) | 
	 *         (left=Expression_Expression_1_0 (operateur='+' | operateur='-') right=Expression)
	 *     )
	 */
	protected void sequence_Expression_Operande_Terme(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     abstractExpressions+=AbstractExpression*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
