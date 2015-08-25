package org.beyene.sius.unit.composition;

import org.beyene.sius.dimension.Dimension;
import org.beyene.sius.dimension.composition.util.Composition;
import org.beyene.sius.unit.Unit;
import org.beyene.sius.unit.UnitId;

public abstract interface CompositeUnit<C1 extends Dimension<C1>, BASE_C1 extends Unit<C1, BASE_C1, BASE_C1>, UNIT_C1 extends Unit<C1, BASE_C1, UNIT_C1>, C2 extends Dimension<C2>, BASE_C2 extends Unit<C2, BASE_C2, BASE_C2>, UNIT_C2 extends Unit<C2, BASE_C2, UNIT_C2>, COMPOSITION extends Composition<C1, C2, COMPOSITION>, BASE_COMPOSITION extends Unit<COMPOSITION, BASE_COMPOSITION, BASE_COMPOSITION>, COMPOSITE_UNIT extends CompositeUnit<C1, BASE_C1, UNIT_C1, C2, BASE_C2, UNIT_C2, COMPOSITION, BASE_COMPOSITION, COMPOSITE_UNIT>> extends Unit<COMPOSITION, BASE_COMPOSITION, COMPOSITE_UNIT>
{
  public abstract UnitId<C1, BASE_C1, UNIT_C1> getComponentUnit1Id();

  public abstract UnitId<C2, BASE_C2, UNIT_C2> getComponentUnit2Id();
}

/* Location:           /Users/kfinisterre/Desktop/Solo/3DRSoloHacks/unpacked_apk/classes_dex2jar.jar
 * Qualified Name:     org.beyene.sius.unit.composition.CompositeUnit
 * JD-Core Version:    0.6.2
 */