package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_sensor_nameMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_sensor_nameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_sensor_name pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Attr_sensor_nameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern attr_sensor_name(sensor : Sensor, value) {
 * 	find element_sensor(sensor);
 * 	
 * 	Sensor.name(sensor, name);
 * 	
 * 	value == eval ("Sensor::" + name);
 * }
 * </pre></code>
 * 
 * @see Attr_sensor_nameMatch
 * @see Attr_sensor_nameProcessor
 * @see Attr_sensor_nameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Attr_sensor_nameMatcher extends BaseMatcher<Attr_sensor_nameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Attr_sensor_nameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Attr_sensor_nameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Attr_sensor_nameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SENSOR = 0;
  
  private final static int POSITION_VALUE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Attr_sensor_nameMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public Attr_sensor_nameMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public Attr_sensor_nameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return matches represented as a Attr_sensor_nameMatch object.
   * 
   */
  public Collection<Attr_sensor_nameMatch> getAllMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return rawGetAllMatches(new Object[]{pSensor, pValue});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return a match represented as a Attr_sensor_nameMatch object, or null if no match is found.
   * 
   */
  public Attr_sensor_nameMatch getOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return rawGetOneArbitraryMatch(new Object[]{pSensor, pValue});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return rawHasMatch(new Object[]{pSensor, pValue});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return rawCountMatches(new Object[]{pSensor, pValue});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue, final IMatchProcessor<? super Attr_sensor_nameMatch> processor) {
    rawForEachMatch(new Object[]{pSensor, pValue}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue, final IMatchProcessor<? super Attr_sensor_nameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSensor, pValue}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Attr_sensor_nameMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return Attr_sensor_nameMatch.newMatch(pSensor, pValue);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object rawAccumulateAllValuesOfsensor(final Object[] parameters) {
    Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> results = new HashSet<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor>();
    rawAccumulateAllValues(POSITION_SENSOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor() {
    return rawAccumulateAllValuesOfsensor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor(final Attr_sensor_nameMatch partialMatch) {
    return rawAccumulateAllValuesOfsensor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor(final String pValue) {
    return rawAccumulateAllValuesOfsensor(new Object[]{
    null, 
    pValue
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue(final Attr_sensor_nameMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pSensor, 
    null
    });
  }
  
  @Override
  protected Attr_sensor_nameMatch tupleToMatch(final Tuple t) {
    try {
    	return Attr_sensor_nameMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) t.get(POSITION_SENSOR), (java.lang.String) t.get(POSITION_VALUE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Attr_sensor_nameMatch arrayToMatch(final Object[] match) {
    try {
    	return Attr_sensor_nameMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (java.lang.String) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Attr_sensor_nameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Attr_sensor_nameMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (java.lang.String) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<Attr_sensor_nameMatcher> querySpecification() throws IncQueryException {
    return Attr_sensor_nameQuerySpecification.instance();
  }
}
