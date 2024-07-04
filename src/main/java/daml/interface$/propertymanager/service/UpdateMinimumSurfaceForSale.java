package daml.interface$.propertymanager.service;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Numeric;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.interface$.common.types.PropertyKey;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpdateMinimumSurfaceForSale extends DamlRecord<UpdateMinimumSurfaceForSale> {
  public static final String _packageId = "63d617a230e28827582264ee3744a561fc8af088ff34f73d66177b7ef8e26382";

  public final BigDecimal newLandMinimumSurfaceForSale;

  public final PropertyKey propertyKey;

  public UpdateMinimumSurfaceForSale(BigDecimal newLandMinimumSurfaceForSale,
      PropertyKey propertyKey) {
    this.newLandMinimumSurfaceForSale = newLandMinimumSurfaceForSale;
    this.propertyKey = propertyKey;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static UpdateMinimumSurfaceForSale fromValue(Value value$) throws
      IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<UpdateMinimumSurfaceForSale> valueDecoder() throws
      IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      BigDecimal newLandMinimumSurfaceForSale = PrimitiveValueDecoders.fromNumeric
          .decode(fields$.get(0).getValue());
      PropertyKey propertyKey = PropertyKey.valueDecoder().decode(fields$.get(1).getValue());
      return new UpdateMinimumSurfaceForSale(newLandMinimumSurfaceForSale, propertyKey);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newLandMinimumSurfaceForSale", new Numeric(this.newLandMinimumSurfaceForSale)));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("propertyKey", this.propertyKey.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<UpdateMinimumSurfaceForSale> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("newLandMinimumSurfaceForSale", "propertyKey"), name -> {
          switch (name) {
            case "newLandMinimumSurfaceForSale": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.numeric(10));
            case "propertyKey": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, daml.interface$.common.types.PropertyKey.jsonDecoder());
            default: return null;
          }
        }
        , (Object[] args) -> new UpdateMinimumSurfaceForSale(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static UpdateMinimumSurfaceForSale fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("newLandMinimumSurfaceForSale", apply(JsonLfEncoders::numeric, newLandMinimumSurfaceForSale)),
        JsonLfEncoders.Field.of("propertyKey", apply(PropertyKey::jsonEncoder, propertyKey)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof UpdateMinimumSurfaceForSale)) {
      return false;
    }
    UpdateMinimumSurfaceForSale other = (UpdateMinimumSurfaceForSale) object;
    return Objects.equals(this.newLandMinimumSurfaceForSale, other.newLandMinimumSurfaceForSale) &&
        Objects.equals(this.propertyKey, other.propertyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newLandMinimumSurfaceForSale, this.propertyKey);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.propertymanager.service.UpdateMinimumSurfaceForSale(%s, %s)",
        this.newLandMinimumSurfaceForSale, this.propertyKey);
  }
}
