package daml.interface$.role.operator;

import static com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders.apply;

import com.daml.ledger.javaapi.data.Party;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoder;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfEncoders;
import com.daml.ledger.javaapi.data.codegen.json.JsonLfReader;
import daml.interface$.common.types.UserRoleKey;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OfferUserRole extends DamlRecord<OfferUserRole> {
  public static final String _packageId = "b93cea58d2cd7e7792117719e7c79bd5a10ca2a87dc57a03f202a3ec5bc6c5d9";

  public final String user;

  public final UserRoleKey userRole;

  public OfferUserRole(String user, UserRoleKey userRole) {
    this.user = user;
    this.userRole = userRole;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static OfferUserRole fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<OfferUserRole> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(2,0,
          recordValue$);
      String user = PrimitiveValueDecoders.fromParty.decode(fields$.get(0).getValue());
      UserRoleKey userRole = UserRoleKey.valueDecoder().decode(fields$.get(1).getValue());
      return new OfferUserRole(user, userRole);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(2);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("user", new Party(this.user)));
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("userRole", this.userRole.toValue()));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  public static JsonLfDecoder<OfferUserRole> jsonDecoder() {
    return JsonLfDecoders.record(Arrays.asList("user", "userRole"), name -> {
          switch (name) {
            case "user": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(0, com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.party);
            case "userRole": return com.daml.ledger.javaapi.data.codegen.json.JsonLfDecoders.JavaArg.at(1, daml.interface$.common.types.UserRoleKey.jsonDecoder());
            default: return null;
          }
        }
        , (Object[] args) -> new OfferUserRole(JsonLfDecoders.cast(args[0]), JsonLfDecoders.cast(args[1])));
  }

  public static OfferUserRole fromJson(String json) throws JsonLfDecoder.Error {
    return jsonDecoder().decode(new JsonLfReader(json));
  }

  public JsonLfEncoder jsonEncoder() {
    return JsonLfEncoders.record(
        JsonLfEncoders.Field.of("user", apply(JsonLfEncoders::party, user)),
        JsonLfEncoders.Field.of("userRole", apply(UserRoleKey::jsonEncoder, userRole)));
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof OfferUserRole)) {
      return false;
    }
    OfferUserRole other = (OfferUserRole) object;
    return Objects.equals(this.user, other.user) && Objects.equals(this.userRole, other.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.user, this.userRole);
  }

  @Override
  public String toString() {
    return String.format("daml.interface$.role.operator.OfferUserRole(%s, %s)", this.user,
        this.userRole);
  }
}
