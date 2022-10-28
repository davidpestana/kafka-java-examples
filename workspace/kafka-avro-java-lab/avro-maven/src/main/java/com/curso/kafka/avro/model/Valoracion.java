/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.curso.kafka.avro.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class Valoracion extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2581791481458514991L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Valoracion\",\"namespace\":\"com.curso.kafka.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"valoracion\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Valoracion> ENCODER =
      new BinaryMessageEncoder<Valoracion>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Valoracion> DECODER =
      new BinaryMessageDecoder<Valoracion>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Valoracion> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Valoracion> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Valoracion> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Valoracion>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Valoracion to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Valoracion from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Valoracion instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Valoracion fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private double valoracion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Valoracion() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param valoracion The new value for valoracion
   */
  public Valoracion(java.lang.Long id, java.lang.Double valoracion) {
    this.id = id;
    this.valoracion = valoracion;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return valoracion;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: valoracion = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'valoracion' field.
   * @return The value of the 'valoracion' field.
   */
  public double getValoracion() {
    return valoracion;
  }


  /**
   * Sets the value of the 'valoracion' field.
   * @param value the value to set.
   */
  public void setValoracion(double value) {
    this.valoracion = value;
  }

  /**
   * Creates a new Valoracion RecordBuilder.
   * @return A new Valoracion RecordBuilder
   */
  public static com.curso.kafka.avro.model.Valoracion.Builder newBuilder() {
    return new com.curso.kafka.avro.model.Valoracion.Builder();
  }

  /**
   * Creates a new Valoracion RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Valoracion RecordBuilder
   */
  public static com.curso.kafka.avro.model.Valoracion.Builder newBuilder(com.curso.kafka.avro.model.Valoracion.Builder other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Valoracion.Builder();
    } else {
      return new com.curso.kafka.avro.model.Valoracion.Builder(other);
    }
  }

  /**
   * Creates a new Valoracion RecordBuilder by copying an existing Valoracion instance.
   * @param other The existing instance to copy.
   * @return A new Valoracion RecordBuilder
   */
  public static com.curso.kafka.avro.model.Valoracion.Builder newBuilder(com.curso.kafka.avro.model.Valoracion other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Valoracion.Builder();
    } else {
      return new com.curso.kafka.avro.model.Valoracion.Builder(other);
    }
  }

  /**
   * RecordBuilder for Valoracion instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Valoracion>
    implements org.apache.avro.data.RecordBuilder<Valoracion> {

    private long id;
    private double valoracion;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.curso.kafka.avro.model.Valoracion.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.valoracion)) {
        this.valoracion = data().deepCopy(fields()[1].schema(), other.valoracion);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Valoracion instance
     * @param other The existing instance to copy.
     */
    private Builder(com.curso.kafka.avro.model.Valoracion other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.valoracion)) {
        this.valoracion = data().deepCopy(fields()[1].schema(), other.valoracion);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Valoracion.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Valoracion.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'valoracion' field.
      * @return The value.
      */
    public double getValoracion() {
      return valoracion;
    }


    /**
      * Sets the value of the 'valoracion' field.
      * @param value The value of 'valoracion'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Valoracion.Builder setValoracion(double value) {
      validate(fields()[1], value);
      this.valoracion = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'valoracion' field has been set.
      * @return True if the 'valoracion' field has been set, false otherwise.
      */
    public boolean hasValoracion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'valoracion' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Valoracion.Builder clearValoracion() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Valoracion build() {
      try {
        Valoracion record = new Valoracion();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.valoracion = fieldSetFlags()[1] ? this.valoracion : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Valoracion>
    WRITER$ = (org.apache.avro.io.DatumWriter<Valoracion>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Valoracion>
    READER$ = (org.apache.avro.io.DatumReader<Valoracion>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeDouble(this.valoracion);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.valoracion = in.readDouble();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.valoracion = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










