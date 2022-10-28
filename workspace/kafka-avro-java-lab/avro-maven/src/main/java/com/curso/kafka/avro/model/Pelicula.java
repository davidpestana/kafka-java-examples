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
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Pelicula extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4173798269400597050L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pelicula\",\"namespace\":\"com.curso.kafka.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"titulo\",\"type\":\"string\"},{\"name\":\"year_pub\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Pelicula> ENCODER =
      new BinaryMessageEncoder<Pelicula>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Pelicula> DECODER =
      new BinaryMessageDecoder<Pelicula>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Pelicula> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Pelicula> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Pelicula> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Pelicula>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Pelicula to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Pelicula from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Pelicula instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Pelicula fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private java.lang.CharSequence titulo;
   private int year_pub;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Pelicula() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param titulo The new value for titulo
   * @param year_pub The new value for year_pub
   */
  public Pelicula(java.lang.Long id, java.lang.CharSequence titulo, java.lang.Integer year_pub) {
    this.id = id;
    this.titulo = titulo;
    this.year_pub = year_pub;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return titulo;
    case 2: return year_pub;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: titulo = (java.lang.CharSequence)value$; break;
    case 2: year_pub = (java.lang.Integer)value$; break;
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
   * Gets the value of the 'titulo' field.
   * @return The value of the 'titulo' field.
   */
  public java.lang.CharSequence getTitulo() {
    return titulo;
  }


  /**
   * Sets the value of the 'titulo' field.
   * @param value the value to set.
   */
  public void setTitulo(java.lang.CharSequence value) {
    this.titulo = value;
  }

  /**
   * Gets the value of the 'year_pub' field.
   * @return The value of the 'year_pub' field.
   */
  public int getYearPub() {
    return year_pub;
  }


  /**
   * Sets the value of the 'year_pub' field.
   * @param value the value to set.
   */
  public void setYearPub(int value) {
    this.year_pub = value;
  }

  /**
   * Creates a new Pelicula RecordBuilder.
   * @return A new Pelicula RecordBuilder
   */
  public static com.curso.kafka.avro.model.Pelicula.Builder newBuilder() {
    return new com.curso.kafka.avro.model.Pelicula.Builder();
  }

  /**
   * Creates a new Pelicula RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Pelicula RecordBuilder
   */
  public static com.curso.kafka.avro.model.Pelicula.Builder newBuilder(com.curso.kafka.avro.model.Pelicula.Builder other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Pelicula.Builder();
    } else {
      return new com.curso.kafka.avro.model.Pelicula.Builder(other);
    }
  }

  /**
   * Creates a new Pelicula RecordBuilder by copying an existing Pelicula instance.
   * @param other The existing instance to copy.
   * @return A new Pelicula RecordBuilder
   */
  public static com.curso.kafka.avro.model.Pelicula.Builder newBuilder(com.curso.kafka.avro.model.Pelicula other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Pelicula.Builder();
    } else {
      return new com.curso.kafka.avro.model.Pelicula.Builder(other);
    }
  }

  /**
   * RecordBuilder for Pelicula instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pelicula>
    implements org.apache.avro.data.RecordBuilder<Pelicula> {

    private long id;
    private java.lang.CharSequence titulo;
    private int year_pub;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.curso.kafka.avro.model.Pelicula.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.titulo)) {
        this.titulo = data().deepCopy(fields()[1].schema(), other.titulo);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.year_pub)) {
        this.year_pub = data().deepCopy(fields()[2].schema(), other.year_pub);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Pelicula instance
     * @param other The existing instance to copy.
     */
    private Builder(com.curso.kafka.avro.model.Pelicula other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.titulo)) {
        this.titulo = data().deepCopy(fields()[1].schema(), other.titulo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.year_pub)) {
        this.year_pub = data().deepCopy(fields()[2].schema(), other.year_pub);
        fieldSetFlags()[2] = true;
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
    public com.curso.kafka.avro.model.Pelicula.Builder setId(long value) {
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
    public com.curso.kafka.avro.model.Pelicula.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'titulo' field.
      * @return The value.
      */
    public java.lang.CharSequence getTitulo() {
      return titulo;
    }


    /**
      * Sets the value of the 'titulo' field.
      * @param value The value of 'titulo'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Pelicula.Builder setTitulo(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.titulo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'titulo' field has been set.
      * @return True if the 'titulo' field has been set, false otherwise.
      */
    public boolean hasTitulo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'titulo' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Pelicula.Builder clearTitulo() {
      titulo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'year_pub' field.
      * @return The value.
      */
    public int getYearPub() {
      return year_pub;
    }


    /**
      * Sets the value of the 'year_pub' field.
      * @param value The value of 'year_pub'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Pelicula.Builder setYearPub(int value) {
      validate(fields()[2], value);
      this.year_pub = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'year_pub' field has been set.
      * @return True if the 'year_pub' field has been set, false otherwise.
      */
    public boolean hasYearPub() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'year_pub' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Pelicula.Builder clearYearPub() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Pelicula build() {
      try {
        Pelicula record = new Pelicula();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.titulo = fieldSetFlags()[1] ? this.titulo : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.year_pub = fieldSetFlags()[2] ? this.year_pub : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Pelicula>
    WRITER$ = (org.apache.avro.io.DatumWriter<Pelicula>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Pelicula>
    READER$ = (org.apache.avro.io.DatumReader<Pelicula>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.titulo);

    out.writeInt(this.year_pub);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.titulo = in.readString(this.titulo instanceof Utf8 ? (Utf8)this.titulo : null);

      this.year_pub = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.titulo = in.readString(this.titulo instanceof Utf8 ? (Utf8)this.titulo : null);
          break;

        case 2:
          this.year_pub = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










